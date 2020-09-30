package io.github.arjundandagi.topicapplication.service;

import io.github.arjundandagi.topicapplication.dao.TopicRepository;
import io.github.arjundandagi.topicapplication.dto.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

/*
    private List<Topic> defaultData = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
    ));
*/
    public List<Topic> getTopics() {
       // return defaultData;
        List <Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    public Topic getTopic(String id){

       return topicRepository.findById(id).get();

    }
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }
    public void updateTopic(String id , Topic topic){
        topicRepository.save(topic);

    }

    public void deleteTopicByID(String id){
        topicRepository.deleteById(id);
    }

}
