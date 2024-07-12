package com.saatvik.course.controller;

import com.saatvik.course.exception.CourseNotFoundException;
import com.saatvik.course.model.Course;
import com.saatvik.course.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@Slf4j
public class CourseController {

    @Autowired
    private CourseService courseService;



    @GetMapping("/{courseId}")
    public Course getCourse(@PathVariable Integer courseId) throws CourseNotFoundException {
        return courseService.findCourseById(courseId);
    }

    @GetMapping("/all")
    public List<Course> getAllCourse()  {
        return courseService.findAllCourse();
    }

    @PutMapping("/update/{courseId}")
    public Course updateCourse(@PathVariable Integer courseId, @RequestBody Course course) throws CourseNotFoundException {


        return courseService.updateCourseById(courseId, course);
    }

    @PostMapping("/add")
    public Course addCourse( @RequestBody Course course) {
        return courseService.addCourse(course);
    }
    @DeleteMapping("/delete/{courseId}")
    public String updateCourse(@PathVariable Integer courseId) throws CourseNotFoundException {
         courseService.deleteCourseById(courseId);
         return "Deleted";
    }

}
