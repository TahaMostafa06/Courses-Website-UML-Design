package com.github.tahamostafa06.backend.database.records;

import java.util.ArrayList;
import java.util.Map;

public class Course implements Record {
    private String title;
    private String description;
    private String instructorId;
    private Map<String, Lesson> lessons;
    private ArrayList<Map<String, Integer>> studentsAndProgress;

    private Course() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public Map<String, Lesson> getLessons() {
        return lessons;
    }

	public ArrayList<Map<String, Integer>> getStudentsAndProgress() {
		return studentsAndProgress;
	}
}

class Lesson {
	private String title;
	private String content;
	private ArrayList<String> optionalResources;

	private Lesson() {
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public ArrayList<String> getOptionalResources() {
		return optionalResources;
	}
}