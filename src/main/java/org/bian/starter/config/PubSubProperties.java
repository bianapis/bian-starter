package org.bian.starter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class PubSubProperties.
 */
@ConfigurationProperties(prefix = PubSubProperties.BIAN_PUBSUB)
public class PubSubProperties {

	/** The Constant BIAN_PUBSUB. */
	public static final String BIAN_PUBSUB = "bian.pubsub";
	
	/** The host. */
	@Value("localhost:9092")
	private String host;

	/** The count. */
	@Value("1000")
	private String count;

	/** The clientid. */
	@Value("client1")
	private String clientid;

	/** The group id. */
	@Value("producerGroup10")
	private String groupId;

	/** The no msg found count. */
	@Value("100")
	private int noMsgFoundCount;

	/** The offset latest. */
	@Value("latest")
	private String offsetLatest;

	/** The offset reset earlier. */
	@Value("earliest")
	private String offsetResetEarlier;

	/** The max poll records. */
	@Value("1")
	private int maxPollRecords;
	
	/**
	 * Gets the host.
	 *
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	
	/**
	 * Sets the host.
	 *
	 * @param host the new host
	 */
	public void setHost(String host) {
		this.host = host;
	}
	
	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	public String getCount() {
		return count;
	}
	
	/**
	 * Sets the count.
	 *
	 * @param count the new count
	 */
	public void setCount(String count) {
		this.count = count;
	}
	
	/**
	 * Gets the clientid.
	 *
	 * @return the clientid
	 */
	public String getClientid() {
		return clientid;
	}
	
	/**
	 * Sets the clientid.
	 *
	 * @param clientid the new clientid
	 */
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	
	/**
	 * Gets the group id.
	 *
	 * @return the group id
	 */
	public String getGroupId() {
		return groupId;
	}
	
	/**
	 * Sets the group id.
	 *
	 * @param groupId the new group id
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	/**
	 * Gets the offset latest.
	 *
	 * @return the offset latest
	 */
	public String getOffsetLatest() {
		return offsetLatest;
	}
	
	/**
	 * Sets the offset latest.
	 *
	 * @param offsetLatest the new offset latest
	 */
	public void setOffsetLatest(String offsetLatest) {
		this.offsetLatest = offsetLatest;
	}
	
	/**
	 * Gets the offset reset earlier.
	 *
	 * @return the offset reset earlier
	 */
	public String getOffsetResetEarlier() {
		return offsetResetEarlier;
	}
	
	/**
	 * Sets the offset reset earlier.
	 *
	 * @param offsetResetEarlier the new offset reset earlier
	 */
	public void setOffsetResetEarlier(String offsetResetEarlier) {
		this.offsetResetEarlier = offsetResetEarlier;
	}
	
	/**
	 * Gets the no msg found count.
	 *
	 * @return the no msg found count
	 */
	public int getNoMsgFoundCount() {
		return noMsgFoundCount;
	}
	
	/**
	 * Sets the no msg found count.
	 *
	 * @param noMsgFoundCount the new no msg found count
	 */
	public void setNoMsgFoundCount(int noMsgFoundCount) {
		this.noMsgFoundCount = noMsgFoundCount;
	}
	
	/**
	 * Gets the max poll records.
	 *
	 * @return the max poll records
	 */
	public int getMaxPollRecords() {
		return maxPollRecords;
	}
	
	/**
	 * Sets the max poll records.
	 *
	 * @param maxPollRecords the new max poll records
	 */
	public void setMaxPollRecords(int maxPollRecords) {
		this.maxPollRecords = maxPollRecords;
	}
}