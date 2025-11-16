package com.github.tahamostafa06.backend.database;

import java.io.IOException;

import com.github.tahamostafa06.backend.database.records.Course;


public class CourseDatabase extends JsonDatabase<Course> {

	public CourseDatabase() throws IOException {
		super("Courses.json");
	}


}
