package com.study.mystyle.answer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.mystyle.question.Question;

public interface AnswerRepository extends JpaRepository<Question,Integer> {

}
