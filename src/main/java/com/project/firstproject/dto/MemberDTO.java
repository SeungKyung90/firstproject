package com.project.firstproject.dto;

public class MemberDTO {
    private String memberId;
    private String memberPw;
    private String memberNm;
    private String memberExpr; // experience 경력(연차)
    private String memberOcp; // occupation 직종

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getMemberNm() {
        return memberNm;
    }

    public void setMemberNm(String memberNm) {
        this.memberNm = memberNm;
    }

    public String getMemberExpr() {
        return memberExpr;
    }

    public void setMemberExpr(String memberExpr) {
        this.memberExpr = memberExpr;
    }

    public String getMemberOcp() {
        return memberOcp;
    }

    public void setMemberOcp(String memberOcp) {
        this.memberOcp = memberOcp;
    }
}
