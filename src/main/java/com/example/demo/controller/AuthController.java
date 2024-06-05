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
                        @RequestParam("name") String name,
                        @RequestParam("password") String password,
                        HttpSession session){
        Optional<Member> optionalUser = memberRepository.findByName(name);
        if(optionalUser.isPresent() && optionalUser.get().getPassword().equals(password)){
            session.setAttribute("member",optionalUser.get());
            return "redirect:welcome";
        }else {
            model.addAttribute("error",
                    "Invalid username or password");
            return "index";
        }

    }

    @GetMapping("/welcome")
    public String welcome(HttpSession session, Model model){
        Member user =  (Member)session.getAttribute("member");
        if(user!=null){
            model.addAttribute("name",user.getName());
            return "result";
        }
        return "redirect:/index";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();//destroy session
        return "redirect:/";
    }

}
