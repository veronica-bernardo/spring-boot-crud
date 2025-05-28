package com.kvcode;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private String techStack;

    // No-arg constructor
    public SoftwareEngineer() {
    }

    // All args constructor
    public SoftwareEngineer(Integer id, String name, String techStack) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }
}


