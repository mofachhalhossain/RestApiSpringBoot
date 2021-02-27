package com.springrest.springrest.springController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CountDownLatch;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    /**@GetMapping("/home")
    public String home(){
        return "This is Homepage";
    }**/

    //get the courses

    @GetMapping("/courses")
    public List<Course> getCourses() {

        return this.courseService.getCourse();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping(path = "/courses",consumes = "application/json")
    public Course addCourse(@RequestBody Course course){

        return this.courseService.addCourse(course);
    }

}
