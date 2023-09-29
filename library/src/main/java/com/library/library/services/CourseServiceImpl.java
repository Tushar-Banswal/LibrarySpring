package com.library.library.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.library.library.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(01, "Let us C", "This Book Contains Basics of C"));
		list.add(new Course(02, "Fundamenatls of Computers", "This Book Contains Computer Information"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

}
