package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("spring","Spring Framework", "Spring FrameWork Description"),
				new Topic("java", "Core Java", "Core Java Description"),
				new Topic("java script", "JavaScript", "JavaScript Description")
				));

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		
		int index = 0;
		for(Topic currentTopic : topics) {
			
			if(currentTopic.getId().equals(id)) {
				topics.set(index++, topic);
			}
		}
		
	}

	public Topic deleteTopic(String id) {
		
		for(Topic currentTopic : topics) {
			if(currentTopic.getId().equals(id)) {
				topics.remove(currentTopic);
				return currentTopic;
			}
		}
		return new Topic();
	}
}
