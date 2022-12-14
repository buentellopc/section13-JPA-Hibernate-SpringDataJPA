package com.in28minutes.jpa.hibernate.demo.repository;

import com.in28minutes.jpa.hibernate.demo.DemoApplication;
import com.in28minutes.jpa.hibernate.demo.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CourseSpringDataRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CourseSpringDataRepository repository;

	@Test
	public void findById_CoursePresent(){
		Optional<Course> courseOptional = repository.findById(10001L);
		assertTrue(courseOptional.isPresent());
//		logger.info("{}", courseOptional.isPresent());
	}

	@Test
	public void findById_CourseNotPresent() {
		Optional<Course> courseOptional = repository.findById(20001L);
		assertFalse(courseOptional.isPresent());
//		logger.info("{}", courseOptional.isPresent());

	}


	@Test
	public void playWithSpringDataRepository() {
//	Course course = new Course("Microservices in 100 steps");
//	repository.save(course);
//
////	update
//		course.setName("Microservices in 100 steps - updated");
//		repository.save(course);
	}


//	sort
	@Test
	public void sort() {
//		Course course = new Course("Microservices in 100 steps");
//		repository.save(course);
//
////	update
//		course.setName("Microservices in 100 steps - updated");
//		repository.save(course);
		Sort sort = new Sort(Sort.Direction.DESC, "name");
		logger.info("Courses -> {}", repository.findAll(sort));
		logger.info("Count -> {}", repository.count());
	}














}
