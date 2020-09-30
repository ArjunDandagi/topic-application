package io.github.arjundandagi.topicapplication.controllers;


import io.github.arjundandagi.topicapplication.dto.Topic;
import io.github.arjundandagi.topicapplication.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @GetMapping("/hello")
    public String hmm(){
        return "Hello";
    }

    @Autowired
    private TopicService arjun;

    @GetMapping("/topics")
    public List<Topic> topics(){
        return arjun.getTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) throws Exception {
        return arjun.getTopic(id);
    }

    @RequestMapping(method =RequestMethod.POST,path = "/topics")
    public void addTopic(@RequestBody Topic topic){
        arjun.addTopic(topic);

    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
         arjun.updateTopic(id,topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id){
         arjun.deleteTopicByID(id);
    }

}


