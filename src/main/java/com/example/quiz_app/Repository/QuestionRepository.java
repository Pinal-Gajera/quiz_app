package com.example.quiz_app.Repository;

import com.example.quiz_app.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
