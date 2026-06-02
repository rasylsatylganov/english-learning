package kg.nurtelecom.englishlearning.repositories;

import kg.nurtelecom.englishlearning.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
