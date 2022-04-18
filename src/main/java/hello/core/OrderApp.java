package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.order.Order;
import hello.core.service.MemberService;
import hello.core.service.MemberServiceImpl;
import hello.core.service.OrderService;
import hello.core.service.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();

        OrderService orderService = appConfig.orderService();
        MemberService memberService = appConfig.memberService();
        
        Member member1 = new Member(1L, "Sim", Grade.VIP);
        memberService.join(member1);

        Order order1 = orderService.createOrder(1L, "Vaseline", 30000);

        System.out.println("order1 = " + order1);
        System.out.println("member1 = " + member1);

    }
}
