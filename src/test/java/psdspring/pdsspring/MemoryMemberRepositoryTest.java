package psdspring.pdsspring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import psdspring.pdsspring.domain.Member;
import psdspring.pdsspring.domain.MemberRepository;
import psdspring.pdsspring.domain.MemoryMemberRepository;
import java.util.List;
import java.util.Optional;

import java.awt.*;

public class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }
    @Test
    public void save(){

        Member member = new Member();

        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        /*Assertions.assertEquals(member, null);*/
       /* Assertions.assertEquals(member, result);*/
        assertThat(result).isEqualTo(member);
    }

    @Test
    public void findByName() {
        //given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        //when
        Member result = repository.findByName("spring1").get();

        //then
        assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll() {
        //given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        //when
        List<Member> result = repository.findAll();

        //then
        assertThat(result.size()).isEqualTo(2) ;
    }


}
