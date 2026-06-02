package kg.nurtelecom.englishlearning.controllers;

import kg.nurtelecom.englishlearning.dto.WordDto;
import kg.nurtelecom.englishlearning.entities.Topic;
import kg.nurtelecom.englishlearning.entities.Word;
import kg.nurtelecom.englishlearning.repositories.TopicRepository;
import kg.nurtelecom.englishlearning.repositories.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/topics")
@RequiredArgsConstructor
public class TopicController {

    private final TopicRepository topicRepository;
    private final WordRepository wordRepository;

    @GetMapping
    public List<Topic> getTopics() {
        return topicRepository.findAll();
    }

    @GetMapping("/{id}/words")
    public List<WordDto> getWords(@PathVariable Long id) {
        return wordRepository.findByTopicId(id)
                .stream()
                .map(w -> new WordDto(w.getId(), w.getEnglish()))
                .toList();
    }
}