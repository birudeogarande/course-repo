package com.saatvik.course.controller;

import com.saatvik.course.exception.CourseNotFoundException;
import com.saatvik.course.model.Course;
import com.saatvik.course.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

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
    @GetMapping("/dummy/all")
    public List<Course> getAllDummyCourse()  {
        Random random = new Random(100);
        return List.of(
                new Course(random.nextInt(),"Java", random.nextDouble()),
                new Course(random.nextInt(),"REST API", random.nextDouble()),
                new Course(random.nextInt(),"Spring boot", random.nextDouble())

        );
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
