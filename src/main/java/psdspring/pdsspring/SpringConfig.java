package psdspring.pdsspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import psdspring.pdsspring.repository.JdbcMemberRepository;
import psdspring.pdsspring.repository.MemberRepository;
import psdspring.pdsspring.repository.MemoryMemberRepository;
import psdspring.pdsspring.service.MemberService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig{

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource  ) {
        this.dataSource = dataSource;
    }
    @Bean
    public MemberService memberService() {
        return  new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        /*return new MemoryMemberRepository();*/
        return new JdbcMemberRepository(dataSource);
    }
}
