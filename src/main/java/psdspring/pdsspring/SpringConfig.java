package psdspring.pdsspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import psdspring.pdsspring.domain.MemberRepository;
import psdspring.pdsspring.domain.MemoryMemberRepository;
import psdspring.pdsspring.service.MemberService;

@Configuration
public class SpringConfig{

    @Bean
    public MemberService memberService() {
        return  new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
