package com.ll.springjpaquerydsl.domain.member.member.service;

import com.ll.springjpaquerydsl.global.rsData.RsData;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import com.ll.springjpaquerydsl.domain.member.member.entity.Member;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class MemberServiceTest {
    @Autowired
    MemberService memberService;

    @Test
    public void t1() {
        RsData<Member> joinRs = memberService.join("usernew", "123");
        Member member = joinRs.getData();
        assertThat(member.getId()).isGreaterThan(0L);
    }
}
