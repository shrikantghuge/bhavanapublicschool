package com.bhavanapublicschool.bean;

public class NewsAndEventBean {
	private String title,photoUrl,description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "NewsAndEventBean [title=" + title + ", photoUrl=" + photoUrl + ", description=" + description + "]";
	}	
}
