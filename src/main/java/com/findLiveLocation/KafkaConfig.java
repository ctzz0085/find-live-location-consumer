package com.findLiveLocation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

	
	@KafkaListener(topics =AppConstants.LIVE_LOCATION_TOPIC_NAME , groupId =AppConstants.GROUP_ID)
	public void updatedLocation(String value) {
		
		System.out.println("Live Location Consumed"+value);
	}
	
	
}
