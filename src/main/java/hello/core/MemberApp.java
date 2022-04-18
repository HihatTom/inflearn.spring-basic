package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.order.Order;
import hello.core.repository.MemoryMemberRepository;
import hello.core.service.MemberService;
import hello.core.service.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        //MemberService memberService1 = new MemberServiceImpl(new MemoryMemberRepository());   //사실 별거 없음. 이거랑 똑같음. 생성자 통해서 넣어주는것뿐

        Member member1 = new Member(1L,"Sim", Grade.VIP);
        Member member2 = new Member(2L,"kim", Grade.BASIC);


        memberService.join(member1);
        memberService.join(member2);

        Order order1 = new Order(1L, "결명자", 5000, 0);

        Member result = memberService.findMember(1L);
        System.out.println("result = " + result);
        System.out.println("member1 = " + member1);

    }
}
