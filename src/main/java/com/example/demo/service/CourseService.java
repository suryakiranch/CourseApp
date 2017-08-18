package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public Course createCourse(Course course) throws Exception {
		return courseRepository.save(course);
	}

	public Course updateCourse(Course course) throws Exception {
		return courseRepository.save(course);
	}

	public void deleteCourse(Long cid) throws Exception {
		courseRepository.delete(cid);
	}

	public List<Course> getAllCourses() throws Exception {

		return courseRepository.findAll();
	}
	public Course getCourseById(Long cid) throws Exception {
		return courseRepository.findOne(cid);
	}

}
