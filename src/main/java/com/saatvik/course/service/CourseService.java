package com.saatvik.course.service;

import com.saatvik.course.exception.CourseNotFoundException;
import com.saatvik.course.model.Course;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CourseService {

    public static final String NOT_FOUND = "NOT FOUND";
    List<Course> courseList = new ArrayList<>();

    public Course findCourseById(Integer courseId) throws CourseNotFoundException {
        return courseList.stream()
                .filter(course -> course.getCourseId()==courseId)
                .findFirst().orElseThrow(()->new CourseNotFoundException(NOT_FOUND));
    }

    public List<Course> findAllCourse() {
        return courseList;
    }


    public Course updateCourseById(Integer courseId, Course course) throws CourseNotFoundException {
        Course found = courseList.stream()
                .filter(obj -> Objects.equals(obj.getCourseId(), courseId))
                .findFirst().orElseThrow(() -> new CourseNotFoundException(NOT_FOUND));
        courseList.remove(found);
        courseList.add(course);
        return course;
    }

    public void deleteCourseById(Integer courseId) throws CourseNotFoundException {

        Course found = courseList.stream()
                .filter(obj -> Objects.equals(obj.getCourseId(), courseId))
                .findFirst().orElseThrow(() -> new CourseNotFoundException(NOT_FOUND));

        courseList.remove(found);

    }

    public Course addCourse(Course course) {
        course.setCourseId(new Random().nextInt(1000));
        courseList.add(course);
        return course;
    }
}
