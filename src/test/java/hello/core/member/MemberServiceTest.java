package hello.core.member;

import hello.core.AppConfig;
import hello.core.repository.MemberRepository;
import hello.core.repository.MemoryMemberRepository;
import hello.core.service.MemberService;
import hello.core.service.MemberServiceImpl;
import hello.core.service.OrderService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    AppConfig appConfig = new AppConfig();

    MemberService memberService = appConfig.memberService();

    @Test
    void join() {
        //given

        Member member = new Member(1L,"SIM", Grade.VIP);
        //when
        memberService.join(member);
        Member resultMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(resultMember);
    }
}
