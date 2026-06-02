package kg.nurtelecom.englishlearning.services;

import kg.nurtelecom.englishlearning.dto.*;
import kg.nurtelecom.englishlearning.entities.*;
import kg.nurtelecom.englishlearning.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TrainingService {

    private final WordRepository wordRepository;
    private final UserAnswerRepository userAnswerRepository;

    public AnswerResponse checkAnswer(AnswerRequest request) {

        Word word = wordRepository.findById(request.getWordId())
                .orElseThrow();

        boolean correct = word.getRussian()
                .equalsIgnoreCase(request.getAnswer().trim());

        int score = correct ? 5 : 0;

        UserAnswer answer = new UserAnswer();
        answer.setWordId(word.getId());
        answer.setAnswer(request.getAnswer());
        answer.setCorrect(correct);
        answer.setScore(score);
        answer.setCreatedAt(LocalDateTime.now());

        userAnswerRepository.save(answer);

        return AnswerResponse.builder()
                .correct(correct)
                .score(score)
                .correctAnswer(word.getRussian())
                .build();
    }
}