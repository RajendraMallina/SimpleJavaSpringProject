package io.javabrains.springbootstarter.topic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TopicControllerTester {

	private TopicService controller = new TopicService();

	@Test
	public void testTopicController() {
		
		assertTrue(controller instanceof TopicService);
	}

	@Test
	public void testGetSetAllTopics() {
		
		List<Topic> setTopics = new ArrayList<>();
		Topic topic1 = new Topic("Perl", "Perl Script", "Perl Scripting Language Description");
		Topic topic2 = new Topic("Ruby", "Ruby Script", "Ruby Scripting Language Description");
		setTopics.add(topic1);
		setTopics.add(topic2);
		controller.setTopics(setTopics);
		
		List<Topic> topics = controller.getTopics();
		assertTrue(topics.contains(topic1));
		assertTrue(topics.contains(topic2));
	}

	@Test
	public void testGetTopic() {
		
		Topic topic = new Topic("Python", "Python Script", "Python Scripting Language Description");
		controller.addTopic(topic);
		Topic topic1 = controller.getTopic("Python");
		assertTrue(topic.equals(topic1));
	}

	@Test
	public void testPostTopic() {
		Topic topic = new Topic("HTML", "Hyper Text Markup Language", "Hyper Text Markup Language Description");
		controller.addTopic(topic);
	}

	@Test
	public void testUpdateTopic() {

		Topic topic = new Topic("CPP", "C++ Programming Language", "C++ Programming Language Description");
		controller.addTopic(topic);

		Topic topic1 = new Topic("PHP", "PreProcessor HyperText", "PHP Description");
		controller.updateTopic(topic1, "CPP");

		assertTrue(topic1.equals(controller.getTopic("PHP")));
	}

	@Test
	public void testDeleteTopic() {

		Topic topic = new Topic("C", "C Programming Language", "C Programming Language Description");
		controller.addTopic(topic);
		assertTrue(topic.equals(controller.deleteTopic("C")));
		assertFalse(" ".equals(controller.deleteTopic("Program")));
	}

}
