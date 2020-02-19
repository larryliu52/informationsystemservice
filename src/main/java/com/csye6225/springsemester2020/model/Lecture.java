package com.csye6225.springsemester2020.model;

public class Lecture {

    private long lectureId;
    private String name;
    private String note;
    private String assoMaterial;
    private String possessedCourse;

    public Lecture() {

    }

    public Lecture(long lectureId, String name, String note, String assoMaterial, String possessedCourse) {
        this.lectureId = lectureId;
        this.name = name;
        this.note = note;
        this.assoMaterial = assoMaterial;
        this.possessedCourse = possessedCourse;
    }

    public String getName() {
        return name;
    }

    public long getLectureId() {
        return lectureId;
    }

    public String getNote() {
        return note;
    }

    public String getAssoMaterial() {
        return assoMaterial;
    }

    public void setLectureId(long lectureId) {
        this.lectureId = lectureId;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setAssoMaterial(String assoMaterial) {
        this.assoMaterial = assoMaterial;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPossessedCourse() {
        return possessedCourse;
    }

    public void setPossessedCourse(String possessedCourse) {
        this.possessedCourse = possessedCourse;
    }
}