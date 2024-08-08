package com.study.mystyle;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.study.mystyle.question.Question;
import com.study.mystyle.question.QuestionRepository;

@SpringBootTest
class MysiteMungunhoApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void contextLoads() {
        Question q1 = new Question();
        q1.setSubject("JPA가 뭔가요?");
        q1.setContent("알고 싶어요.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1); // 첫 번째 질문 저장
    }
}
