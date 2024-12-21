package com.example.quiz_app.Service;

import com.example.quiz_app.Model.Question;
import com.example.quiz_app.Model.QuizSession;
import com.example.quiz_app.Repository.QuestionRepository;
import com.example.quiz_app.Repository.QuizSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class QuizService {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuizSessionRepository quizSessionRepository;



    public QuizSession startNewQuiz() {
        QuizSession session = new QuizSession();
        session.setTotalQuestions(0);
        session.setCorrectAnswers(0);
        session.setIncorrectAnswers(0);
        return quizSessionRepository.save(session);
    }

    public Optional<Question> getRandomQuestion() {
        List<Question> questions = questionRepository.findAll();
        if (questions.isEmpty()) return Optional.empty();
        Random random = new Random();
        return Optional.of(questions.get(random.nextInt(questions.size())));
    }

    public QuizSession submitAnswer(Long sessionId, Long questionId, String selectedAnswer) {
        QuizSession session = quizSessionRepository.findById(sessionId)
                .orElseThrow(() -> new RuntimeException("Session not found"));
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new RuntimeException("Question not found"));

        session.setTotalQuestions(session.getTotalQuestions() + 1);
        if (question.getCorrectAnswer().equalsIgnoreCase(selectedAnswer)) {
            session.setCorrectAnswers(session.getCorrectAnswers() + 1);
        } else {
            session.setIncorrectAnswers(session.getIncorrectAnswers() + 1);
        }
        return quizSessionRepository.save(session);
    }

    public QuizSession getResult(Long sessionId) {
        return quizSessionRepository.findById(sessionId)
                .orElseThrow(() -> new RuntimeException("Session not found"));
    }
}
