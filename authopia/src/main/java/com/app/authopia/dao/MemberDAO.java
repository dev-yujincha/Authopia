package com.app.authopia.dao;

import com.app.authopia.domain.vo.MemberVO;
import com.app.authopia.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberDAO {
    private final MemberMapper memberMapper;

    // 이메일 중복 검사
    public Optional<MemberVO> findByMemberEmail(String memberEmail){
        return memberMapper.selectByMemberEmail(memberEmail);
    };

    // 회원가입
    public void save(MemberVO memberVO){
        memberMapper.insert(memberVO);
    };

    // 로그인
    public Optional<Long> findByMemberEmailAndMemberPassword(String memberEmail, String memberPassword){
        return memberMapper.selectByMemberEmailAndMemberPassword(memberEmail, memberPassword);
    };
}