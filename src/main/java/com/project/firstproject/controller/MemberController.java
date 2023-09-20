package com.project.firstproject.controller;

import com.project.firstproject.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @GetMapping("/login")
    public String login() {
        return "member/login";
    }

    @GetMapping("/join")
    public String join() {
        return "member/join";
    }

    @PostMapping("/join/create")
    public String joinCreate(MemberDTO dto) {
        System.out.println(dto.getMemberId());
        return "redirect:/";
    }

}
