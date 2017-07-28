package com.sites.dialhub.tools;

public class DashboardModel {

	private String userName;
	private String callReason;
	private String callDuration;
	private String dateTime;

	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String users) {
		this.userName = users;
	}
	
	public String getCallReason() {
		return callReason;
	}

	public void setCallReason(String reason) {
		this.callReason = reason;
	}
	
	public String getCallDuration() {
		return callDuration;
	}
	
	public void setCallDuration(String callDuration) {
		this.callDuration = callDuration;
	}
	
	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String date) {
		this.dateTime = date;
	}


}
