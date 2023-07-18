package com.ktds.duhyeon.service;

import com.ktds.duhyeon.data.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.ktds.duhyeon.data.entity.Member;


@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService{
    private final MemberRepository memberRepository;
    @Override
    public String getName(long memberId) {
        Member member = memberRepository.findByMemberId(memberId);
        System.out.println(member.getMemberNm());
        return member.getMemberNm();
    }
}
