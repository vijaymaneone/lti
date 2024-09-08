package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.entities.Courses;



@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao coursesDao;
	
	//List<Courses> list;
	
	public CourseServiceImpl() {
		
//		list=new ArrayList();
//		list.add(new Courses(145,"Core java","Alll basic core java concepts covered"));
//		list.add(new Courses(146,"spring boot","CRUD"));
//		list.add(new Courses(147,"ANGULAR","Right correct54"));
		
	}

	@Override
	public List<Courses> getCourses() {
		
		return coursesDao.findAll();
	}

	@Override
	public Courses getCourse(long courseId) {
//		Courses  c=null;
//		for(Courses courses:list) { 
//			if( courses.getId()==courseId) {
//				c=courses;
//				break;
//			}
//		}
		return coursesDao.getOne(courseId);
	}
	
	@Override
	public Courses addCourse(Courses courses) {
//		list.add(courses);
		coursesDao.save(courses);
		return courses;
	}

	@Override
	public Courses updateCourse(Courses courses) {
//		list.forEach(e -> {
//			if(e.getId()==courses.getId()) {
//				e.setTitle(courses.getTitle());
//				e.setDescription(courses.getDescription());
//			}
//		});
		coursesDao.save(courses);
		return courses;
			
	}
 
	@Override
	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
		Courses entity=coursesDao.getOne(parseLong);
		coursesDao.delete(entity);
		
	}

	

}
