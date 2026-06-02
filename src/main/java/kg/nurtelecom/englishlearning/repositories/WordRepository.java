package kg.nurtelecom.englishlearning.repositories;

import kg.nurtelecom.englishlearning.entities.Word;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordRepository extends JpaRepository<Word, Long> {

    List<Word> findByTopicId(Long topicId);
}