package com.project.firstproject.dao;

import com.project.firstproject.dto.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public int insert(MemberDTO dto) {
        int cnt = 0;
        cnt = sqlSession.insert("mapper.memberMapper.insert", dto);

        return cnt;
    }

    public int idCheck(String memberId) {
        int idCnt = 0;
        idCnt = sqlSession.selectOne("mapper.memberMapper.idCheck", memberId);

        return idCnt;
    }
}
