package kg.nurtelecom.englishlearning.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "words")
@Getter
@Setter
public class Word {

    @Id
    private Long id;

    @Column(nullable = false)
    private String english;

    @Column(nullable = false)
    private String russian;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topic_id")
    private Topic topic;
}
