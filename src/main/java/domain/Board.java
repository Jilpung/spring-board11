package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "board_id")
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private Long createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
