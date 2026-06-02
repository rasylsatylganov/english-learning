package kg.nurtelecom.englishlearning.dto;

import lombok.Data;

@Data
public class AnswerRequest {

    private Long wordId;
    private String answer;
}
