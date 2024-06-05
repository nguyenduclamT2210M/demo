package com.example.demo.controller;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class AuthController {
    @Autowired
    private MemberRepository memberRepository;


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/login")
    public String login(Model model,
                        @RequestParam("user_id") String user_id,
                        @RequestParam("password") String password,
                        HttpSession session){
        Optional<Member> optionalUser = memberRepository.findByUserId(user_id);
        if(optionalUser.isPresent() && optionalUser.get().getPassword().equals(password)){
            session.setAttribute("user",optionalUser.get());
            return "redirect:welcome";
        }else {
            model.addAttribute("error",
                    "Invalid username or password");
            return "index";
        }

    }

    @GetMapping("/welcome")
    public String welcome(HttpSession session, Model model){
        Member user =  (Member)session.getAttribute("user");
        if(user!=null){
            model.addAttribute("user_id",user.getUserId());
            return "result";
        }
        return "redirect:/";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();//destroy session
        return "redirect:/";
    }

}
