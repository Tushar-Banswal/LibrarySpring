package com.library.library.entities;

public class Course {

	
	

	private long id;
	private String ditle;
	private String description;

	public Course(long id, String ditle, String description) {
		super();
		this.id = id;
		this.ditle = ditle;
		this.description = description;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDitle() {
		return ditle;
	}

	public void setDitle(String ditle) {
		this.ditle = ditle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", ditle=" + ditle + ", description=" + description + "]";
	}
 




}
