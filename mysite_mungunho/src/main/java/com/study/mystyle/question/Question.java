package com.study.mystyle.question;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import com.study.mystyle.answer.Answer; // Answer 클래스 임포트

@Getter
@Setter
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100) // 글자의 개수를 100개(영문, 한글 동일)
    private String subject;

    @Column(columnDefinition = "TEXT") // 글자의 갯수를 무한대
    private String content;

    private LocalDateTime createDate; // DB에서는 create_date

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) //질문이 삭제되면 관련 답변도 모두 삭제하겠다.
    private List<Answer> answerList;
}
