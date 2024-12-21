package com.example.quiz_app.Controller;

import com.example.quiz_app.Model.Question;
import com.example.quiz_app.Model.QuizSession;
import com.example.quiz_app.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@RestController
@RequestMapping("/api/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping("/start")
    public QuizSession startQuiz() {
        return quizService.startNewQuiz();
    }

    @GetMapping("/question")
    public Optional<Question> getQuestion() {
        return quizService.getRandomQuestion();
    }

    @PostMapping("/submit")
    public QuizSession submitAnswer(@RequestParam(value = "sid") Long sessionId, @RequestParam(value = "aid") Long questionId, @RequestParam(value = "answer") String answer) {
        return quizService.submitAnswer(sessionId, questionId, answer);
    }

    @GetMapping("/result")
    public QuizSession getResult(@RequestParam Long sessionId) {
        return quizService.getResult(sessionId);
    }
}
