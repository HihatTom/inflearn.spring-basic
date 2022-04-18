package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    DiscountPolicy discountPolicy = new RateDiscountPolicy();
    @Test
    @DisplayName("VIP면 10% Discount 테스트")
    void getDiscount(){
        Member member1 = new Member(1L, "Sim", Grade.VIP);
        int result = discountPolicy.discount(member1, 20000);
        assertThat(result).isEqualTo(2000);
    }

    @Test
    @DisplayName("VIP아니면 Discount 안함 테스트")
    void getDiscount_BASIC(){
        Member member1 = new Member(2L, "Kim", Grade.BASIC);
        int result = discountPolicy.discount(member1, 20000);
        assertThat(result).isEqualTo(2000);
    }


}