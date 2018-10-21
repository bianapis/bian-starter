package org.bian.starter.pubsub;

import org.bian.pubsub.PubSubConsumer;
import org.bian.pubsub.PubSubProducer;
import org.bian.starter.config.PubSubProperties;
import org.springframework.beans.factory.annotation.Autowired;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating PubSub objects.
 */
public class PubSubFactory {

	/** The pub sub properties. */
	@Autowired
	PubSubProperties pubSubProperties;
	
	/** The producer instance. */
	private PubSubProducer producerInstance; 
	
	/** The consumer instance. */
	private PubSubConsumer consumerInstance;
	
	/**
	 * Gets the consumer.
	 *
	 * @return the consumer
	 */
	public PubSubConsumer getConsumer() {
		System.out.println(pubSubProperties.getHost()+ pubSubProperties.getGroupId()+ pubSubProperties.getMaxPollRecords()+ pubSubProperties.getOffsetResetEarlier()+ pubSubProperties.getNoMsgFoundCount());
		if (consumerInstance == null) {
			consumerInstance = new PubSubConsumer(pubSubProperties.getHost(), pubSubProperties.getGroupId(), pubSubProperties.getMaxPollRecords(), pubSubProperties.getOffsetResetEarlier(), pubSubProperties.getNoMsgFoundCount());
		}
		return consumerInstance;
	}
	
	/**
	 * Gets the producer.
	 *
	 * @return the producer
	 */
	public PubSubProducer getProducer() {
		System.out.println(pubSubProperties.getHost()+ pubSubProperties.getClientid());
		if (producerInstance == null) {
			producerInstance = new PubSubProducer(pubSubProperties.getHost(), pubSubProperties.getClientid());
		}
		return producerInstance;
	}
}
