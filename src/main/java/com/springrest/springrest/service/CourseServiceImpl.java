package com.springrest.springrest.service;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;
    Course newCourse = new Course();


    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(133, "SpringBoot", "SpringBoot Crash Course"));
        list.add(new Course(343,"SpringMvc","SpringMvc Crash Course"));
    }

    @Override
    public List<Course> getCourse() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course:list){
            if(course.getId() == courseId){
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    }



