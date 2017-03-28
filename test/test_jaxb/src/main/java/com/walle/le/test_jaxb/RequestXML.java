/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.walle.le.test_jaxb;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lhphuong86
 */
@XmlRootElement
public class RequestXML extends RegisterXML {

	private String channelCode;

	@Override
	public String toString() {
		return "RequestXML{" + "channelCode=" + channelCode + ", dataSign=" + dataSign + ", phoneNumber=" + phoneNumber + ", sessionID=" + sessionID + ", transID=" + transID + ", fullName=" + fullName + ", personalID=" + personalID + ", vcbID=" + vcbID + ", waitingReg=" + waitingReg + '}';
	}
	private String dataSign;
	private String phoneNumber;
	private String sessionID;
	private String transID;
	private String fullName;
	private String personalID;
	private String vcbID;
	private String waitingReg;

	/**
	 * @return the channelCode
	 */
	public String getChannelCode() {
		return channelCode;
	}

	/**
	 * @param channelCode the channelCode to set
	 */
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/**
	 * @return the dataSign
	 */
	public String getDataSign() {
		return dataSign;
	}

	/**
	 * @param dataSign the dataSign to set
	 */
	public void setDataSign(String dataSign) {
		this.dataSign = dataSign;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the sessionID
	 */
	public String getSessionID() {
		return sessionID;
	}

	/**
	 * @param sessionID the sessionID to set
	 */
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	/**
	 * @return the transID
	 */
	public String getTransID() {
		return transID;
	}

	/**
	 * @param transID the transID to set
	 */
	public void setTransID(String transID) {
		this.transID = transID;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the personalID
	 */
	public String getPersonalID() {
		return personalID;
	}

	/**
	 * @param personalID the personalID to set
	 */
	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}

	/**
	 * @return the vcbID
	 */
	public String getVcbID() {
		return vcbID;
	}

	/**
	 * @param vcbID the vcbID to set
	 */
	public void setVcbID(String vcbID) {
		this.vcbID = vcbID;
	}

	/**
	 * @return the waitingReg
	 */
	public String getWaitingReg() {
		return waitingReg;
	}

	/**
	 * @param waitingReg the waitingReg to set
	 */
	public void setWaitingReg(String waitingReg) {
		this.waitingReg = waitingReg;
	}

}
