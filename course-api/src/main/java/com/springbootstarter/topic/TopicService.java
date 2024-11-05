/**
 * 
 */
package com.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("1", "English", "This is English"),
			new Topic("2", "Hindi", "This is Hindi"),
			new Topic("3", "Bengali", "This is Bengali")				
			);

	public List<Topic> getAllTopics(){
		return topics;
	};
	
	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	
}
