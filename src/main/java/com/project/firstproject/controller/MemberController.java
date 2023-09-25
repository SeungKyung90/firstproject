package com.project.firstproject.controller;

import com.project.firstproject.dto.MemberDTO;
import com.project.firstproject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

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
        //System.out.println(dto.getMemberId());
        int cnt = memberService.insert(dto);
        if(cnt > 0) {
            return "redirect:/login";
        } else {
            return "redirect:/join";
        }

    }

    @ResponseBody
    @RequestMapping("/idCheck")
    public HashMap<String,Integer> idCheck(@RequestParam("memberId") String memberId){
        int idCnt = 0;
        idCnt = memberService.idCheck(memberId);

        HashMap<String,Integer> result = new HashMap<>();
        result.put("idCnt",idCnt);

        return result;
    }
}
