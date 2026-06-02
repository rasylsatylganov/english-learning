package kg.nurtelecom.englishlearning.repositories;

import kg.nurtelecom.englishlearning.entities.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {
}