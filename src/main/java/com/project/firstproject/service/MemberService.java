package com.project.firstproject.service;

import com.project.firstproject.dao.MemberDAO;
import com.project.firstproject.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberDAO memberDAO;


    public int insert(MemberDTO dto) {
        return memberDAO.insert(dto);
    }

    public int idCheck(String memberId) {
        return memberDAO.idCheck(memberId);
    }
}
