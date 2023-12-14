package com.ll.springjpaquerydsl.domain.member.member.repository;

import com.ll.springjpaquerydsl.domain.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
