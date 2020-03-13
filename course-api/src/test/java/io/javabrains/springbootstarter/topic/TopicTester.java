package io.javabrains.springbootstarter.topic;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TopicTester {
	
	private Topic myTopic = new Topic("HTML", "Hyper Text Markup Language",
										"Hyper Text Markup Language Description");
	@Test
	public void testTopicTester() {
		Topic topic = new Topic();
		assertTrue(topic instanceof Topic);
	}
	
	@Test
	public void testTopicObject() {
		assertTrue(myTopic instanceof Topic);
	}
	
	@Test
	public void testTopicId() {
		String id = myTopic.getId();
		assertSame("HTML", id);
	}
	
	@Test
	public void testTopicName() {
		String name = myTopic.getName();
		assertSame("Hyper Text Markup Language", name);
	}
	
	@Test
	public void testTopicDescription() {
		String description = myTopic.getDescription();
		assertSame("Hyper Text Markup Language Description", description);
	}
	
	@Test
	public void testChangeTopicId() {
		myTopic.setId("PHP");
		String newId = myTopic.getId();
		assertSame("PHP", newId);
	}
	
	@Test
	public void testChangeTopicName() {
		myTopic.setName("PreProcessorHyperText");
		String newName = myTopic.getName();
		assertSame("PreProcessorHyperText", newName);
	}
	
	@Test
	public void testChangeTopicDescription() {
		myTopic.setDescription("PHP Description");
		String newDescription = myTopic.getDescription();
		assertSame("PHP Description", newDescription);
	}

}
