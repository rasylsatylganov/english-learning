package kg.nurtelecom.englishlearning.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_answers")
@Getter
@Setter
public class UserAnswer {

    @Id
    private Long id;

    private Long userId;

    private Long wordId;

    private String answer;

    private Boolean correct;

    private Integer score; // 0–5

    private LocalDateTime createdAt;
}
