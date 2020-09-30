package io.github.arjundandagi.topicapplication.dao;

import io.github.arjundandagi.topicapplication.dto.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository <Topic,String> {
    //getalltopics
    //get topic given id
    //create a new topic

}
