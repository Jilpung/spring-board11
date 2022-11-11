package domain.repository;

import domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository  {
    private final EntityManager em;

    public void saveMember(Member member) {
        em.persist(member);
    }

    public Member findOne(Long id){
        return em.find(Member.class, id);
    }
    public List<Member> findAll() {
        return em.createQuery("select m from Member m")
                .getResultList();
    }

    public List<Member> findByName(String username){
        return em.createQuery("select m from Member m where m.username = :username", Member.class)
                .setParameter("username", username)
                .getResultList();
    }
}
