package com.example.quiz_app.Repository;

import com.example.quiz_app.Model.QuizSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizSessionRepository extends JpaRepository<QuizSession, Long> {
}
