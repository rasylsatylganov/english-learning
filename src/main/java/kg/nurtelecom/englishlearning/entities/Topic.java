package kg.nurtelecom.englishlearning.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "topics")
@Getter
@Setter
public class Topic {

    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    private String name; // Pronouns, Verbs, etc.
}