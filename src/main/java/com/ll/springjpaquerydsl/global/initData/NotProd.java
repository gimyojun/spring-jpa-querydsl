package com.ll.springjpaquerydsl.global.initData;

import com.ll.springjpaquerydsl.domain.member.member.entity.Member;
import com.ll.springjpaquerydsl.domain.member.member.service.MemberService;
import com.ll.springjpaquerydsl.global.rsData.RsData;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("!prod")
@Configuration
public class NotProd {
    @Bean
    public ApplicationRunner initNotProd(MemberService memberService) {
        return args -> {
            RsData<Member> joinRs = memberService.join("user1", "123");
            System.out.println(joinRs.getMsg());
        };
    }
}
