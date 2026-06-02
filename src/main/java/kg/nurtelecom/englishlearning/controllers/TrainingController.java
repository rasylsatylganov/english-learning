package kg.nurtelecom.englishlearning.controllers;

import kg.nurtelecom.englishlearning.dto.AnswerRequest;
import kg.nurtelecom.englishlearning.dto.AnswerResponse;
import kg.nurtelecom.englishlearning.services.TrainingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/training")
@RequiredArgsConstructor
public class TrainingController {

    private final TrainingService trainingService;

    @PostMapping("/answer")
    public AnswerResponse check(@RequestBody AnswerRequest request) {
        return trainingService.checkAnswer(request);
    }
}