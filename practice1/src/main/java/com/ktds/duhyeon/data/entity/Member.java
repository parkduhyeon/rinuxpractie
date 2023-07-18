package com.ktds.duhyeon.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "MEMBER")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키 자동 생성
    @Column(name = "MEMBER_ID")
    private long memberId;

    @Column(name = "MEMBER_NM")
    private String memberNm;
}
