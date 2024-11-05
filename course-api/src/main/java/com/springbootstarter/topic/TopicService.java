/**
 * 
 */
package com.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class TopicService {

	// immuatable list
//	private List<Topic> topics = Arrays.asList(
//			new Topic("1", "English", "This is English"),
//			new Topic("2", "Hindi", "This is Hindi"),
//			new Topic("3", "Bengali", "This is Bengali")				
//			);

	// mutable list
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("1", "English", "This is English"),
			new Topic("2", "Hindi", "This is Hindi"),
			new Topic("3", "Bengali", "This is Bengali")				
			));

			public List<Topic> getAllTopics() {
				return topics;
			};

			public Topic getTopicById(String id) {
				return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
			}

			public void addTopic(Topic topic) {
				topics.add(topic);
			}

			public void updateTopic(String id, Topic topic) {
				for (int i = 0; i < topics.size(); i++) {
					if (topics.get(i).getId().equals(id)) {
						topics.set(i, topic);
						return;
					}
				}
			}

			public void deleteTopic(String id) {
				topics.removeIf(t -> t.getId().equals(id));
			}
	
}
