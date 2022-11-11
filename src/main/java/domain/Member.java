package domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name = "member")
@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String username;
    private String password;
    private String email;
    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<Board> board = new ArrayList<>();

    @Builder
    public Member(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    protected Member(){}
}
