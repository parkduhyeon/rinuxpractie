package com.ktds.duhyeon.data.repository;


import com.ktds.duhyeon.data.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    public Member findByMemberId(long memberId);
}
