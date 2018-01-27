package com.examples.hamcrest;

public class Todo {

    private final long id;
    private String summary;
    private String description;
    private int year;

    Todo(long id, String summary, String description) {
        this.id = id;
        this.summary = summary;
        this.description = description;
    }

    // getters/setters

    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
