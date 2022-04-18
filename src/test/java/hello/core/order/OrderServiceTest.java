package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.service.MemberService;
import hello.core.service.MemberServiceImpl;
import hello.core.service.OrderService;
import hello.core.service.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    AppConfig appConfig = new AppConfig();

    OrderService orderService = appConfig.orderService();
    MemberService memberService = appConfig.memberService();


    @Test
    void createOrder(){
        //given
        Member member1 = new Member(1L, "Sim", Grade.VIP);



        //when
        memberService.join(member1);

        Order order1 = orderService.createOrder(1L, "Mouse", 7500);

        //then
        Assertions.assertThat(order1.calculatePrice()).isEqualTo(6500);
    }
}
