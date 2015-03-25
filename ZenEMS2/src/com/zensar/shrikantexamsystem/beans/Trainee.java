package com.zensar.shrikantexamsystem.beans;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * @author shghuge
 *
 */
@XmlRootElement
public class Trainee {
	public Trainee() {
		System.out.println("The terainee has been initialized");
	}
	private int id;
	private String username;
	private long mobileNo;
	private String emailId;
	private String password;
	private Result result;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", username=" + username + ", mobileNo="
				+ mobileNo + ", emailId=" + emailId + ", password=" + password
				+ ", result=" + result + "]";
	}
	
}

