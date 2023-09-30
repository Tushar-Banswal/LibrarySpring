package com.library.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.library.entities.Course;
import com.library.library.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
   
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to Library Application"; 
	}
	 
	
	// get courses 	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
	   return this.courseService.getCourses();
	}

	//get books through api's
	@GetMapping(value = "/books")
	public List<Object> getBooks() {
		
		Map<String, String> params = new HashMap<>();
		params.put("X-Rapidapi-Key", "14ecb7ca5amshbc6f11972fd65eap11ea23jsn7b5659b242a2");
		params.put("X-Rapidapi-Host", "book-finder1.p.rapidapi.com");

		String url = "https://book-finder1.p.rapidapi.com/api/search";

		RestTemplate restTemp = new RestTemplate();
		Object[] results = restTemp.getForObject(url, Object[].class, params);

		return Array.asList(results);
	}
}
