package com.shaikha.programming_language_api.Model;

import java.time.LocalDate;

public class ProgrammingLanguage {
    //define fields
    private int id;
    private String name;
    private String creator;
    private int yearCreated;
    private String difficulty;
    private String mainUse;

    //constructor
    public ProgrammingLanguage(int id, String name, String creator, int yearCreated, String difficulty, String mainUse) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.yearCreated = yearCreated;
        this.difficulty = difficulty;
        this.mainUse = mainUse;
    }

    //no-argument constructor -- when Spring receives JSON with @RequestBody
    public ProgrammingLanguage(){
    }

    //getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getMainUse() {
        return mainUse;
    }

    public void setMainUse(String mainUse) {
        this.mainUse = mainUse;
    }
}
