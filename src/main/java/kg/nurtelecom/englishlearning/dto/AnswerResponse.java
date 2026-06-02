package kg.nurtelecom.englishlearning.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnswerResponse {

    private boolean correct;
    private int score;
    private String correctAnswer;
}