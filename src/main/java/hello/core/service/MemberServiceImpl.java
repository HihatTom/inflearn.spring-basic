package hello.core.service;

import hello.core.member.Member;
import hello.core.repository.MemberRepository;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository repository;  //얘도 바꿔야되는건 똑같애;;;  구현체에 의존하고 있어!!!

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.repository = memberRepository;
    }
    //private static final MemoryMemberRepository repository = new MemoryMemberRepository();  이렇게 짜면 나중에 구현체 바꿀때 반영이 안돼..


    @Override
    public void join(Member member) {
        repository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return repository.findById(memberId);
    }
}

