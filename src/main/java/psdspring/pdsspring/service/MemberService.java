package psdspring.pdsspring.service;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import psdspring.pdsspring.domain.Member;
import psdspring.pdsspring.domain.MemberRepository;
import psdspring.pdsspring.domain.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
    * 회원 가입
    * */
    public Long join(Member member) {
        //같은 이름이 있는 중복 회원 x
        vadate(member);
        memberRepository.save(member);
        return member.getId();

    }

    private void vadate(Member member) {
        memberRepository.findByName(member.getName()).
        ifPresent(m -> { throw new IllegalStateException("이미 존재하는 회원입니다.");
              });
    }

    /*
    * 전체 회원 조회
    * */

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
