package com.shaikha.programming_language_api.Controller;

import com.shaikha.programming_language_api.Model.ProgrammingLanguage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

@RestController
public class ProgrammingLanguageController {
    //array list for sample data
    private ArrayList<ProgrammingLanguage> languages = new ArrayList<>();

    //use the controller's constructor to add data
    public ProgrammingLanguageController() {
        languages.add(new ProgrammingLanguage(1,"Java","James Gosling", 1995, "Intermediate","Backend Development"));
        languages.add(new ProgrammingLanguage(2,"Python","Guido van Rossum", 1991, "Beginner","Data Science"));
        languages.add(new ProgrammingLanguage(3,"JavaScript","Brendan Eich", 1995, "Beginner","Web Development"));
        languages.add(new ProgrammingLanguage(4,"C++","Bjarne Stroustrup", 1985, "Advanced","Systems Programming"));
        languages.add(new ProgrammingLanguage(5,"Swift","Chris Lattner", 2014, "Intermediate","iOS Development"));
        languages.add(new ProgrammingLanguage(6,"SQL","Donald D. Chamberlin and Raymond F. Boyce", 1974, "Beginner","Database Management"));
    }


    //Endpoint 1: Welcome
    @GetMapping("/welcome")
    public Map<String, String> welcome(){
        return Map.of("application", "Programming Languages API",
                "developer", "Shaikha",
                "description","A REST API for exploring and managing programming languages",
                "theme",  "Programming Languages");
    }

    //Endpoint 2: get all languages
    @GetMapping("/languages")
    public ArrayList<ProgrammingLanguage> getAllLanguages(){
        return languages;
    }

    //Endpoint 3: get one language
    @GetMapping("/languages/{id}")
    public ResponseEntity<ProgrammingLanguage> getOneLanguages(@PathVariable int id){
        //loop through all languages
        for (ProgrammingLanguage language : languages){
            if (language.getId() == id){
                return ResponseEntity.ok(language);
            }
        }
        //handle when no id matches
        return ResponseEntity.notFound().build();
    }

    //Endpoint 4: search a language
    @GetMapping("/languages/search")
    public ArrayList<ProgrammingLanguage> searchLanguages(@RequestParam String name){
        //create an array
        ArrayList<ProgrammingLanguage> result = new ArrayList<>();

        //loop through all languages
        for (ProgrammingLanguage language : languages){
            if(language.getName().toLowerCase().contains(name.toLowerCase())){
                result.add(language);
            }
        }
        return result;
    }

    //Endpoint 5: filter languages by difficulty
    @GetMapping("/languages/filter")
    public ArrayList<ProgrammingLanguage> filterLanguages(@RequestParam String difficulty){
        //create an array
        ArrayList<ProgrammingLanguage> result = new ArrayList<>();
        //loop through all languages
        for (ProgrammingLanguage language : languages){
            if(language.getDifficulty().equalsIgnoreCase(difficulty.toLowerCase())){
                result.add(language);
            }
        }
        return result;
    }

    //Endpoint 6: create new language
    @PostMapping("/languages")
    public ProgrammingLanguage addLanguage(@RequestBody ProgrammingLanguage language){
        //add new language to the list
        languages.add(language);

        //return new created language
        return language;
    }

    //Endpoint 7: update a language
    @PutMapping("/languages/{id}")
    public ResponseEntity<ProgrammingLanguage> updateLanguage(@PathVariable int id, @RequestBody ProgrammingLanguage updatedLanguage){
        //loop through all languages
        for (ProgrammingLanguage language : languages){
            if(language.getId() == id){
                language.setName(updatedLanguage.getName());
                language.setCreator(updatedLanguage.getCreator());
                language.setYearCreated(updatedLanguage.getYearCreated());
                language.setDifficulty(updatedLanguage.getDifficulty());
                language.setMainUse(updatedLanguage.getMainUse());

                //return the updated language
                return ResponseEntity.ok(language);
            }
        }
        //handle when no id matches
        return ResponseEntity.notFound().build();
    }

    //Endpoint 8: delete a language
    @DeleteMapping("/languages/{id}")
    public ResponseEntity<Void> deleteLanguage(@PathVariable int id) {
        //store deleted language
        boolean removed = languages.removeIf(language -> language.getId() == id);

        if(removed){
            return ResponseEntity.noContent().build();
        }
        //handle when no id matches
        return ResponseEntity.notFound().build();
    }

    //Endpoint 9: Statistics / Summary
    @GetMapping("/languages/stats")
    public Map<String, Object> getStatistics() {
        // counters
        int beginnerCount = 0;
        int intermediateCount = 0;
        int advancedCount = 0;
        int totalYears = 0;

        //ProgrammingLanguage to get oldest and newest
        ProgrammingLanguage oldestLanguage = languages.get(0);
        ProgrammingLanguage newestLanguage = languages.get(0);

        //loop through languages
        for (ProgrammingLanguage language : languages) {

            //count each difficulty
            if (language.getDifficulty().equalsIgnoreCase("Beginner")) {
                beginnerCount++;
            } else if (language.getDifficulty().equalsIgnoreCase("Intermediate")) {
                intermediateCount++;
            } else if (language.getDifficulty().equalsIgnoreCase("Advanced")) {
                advancedCount++;
            }

            //add years for average
            totalYears += language.getYearCreated();

            //find oldest language
            if (language.getYearCreated() < oldestLanguage.getYearCreated()) {
                oldestLanguage = language;
            }

            // find newest language
            if (language.getYearCreated() > newestLanguage.getYearCreated()) {
                newestLanguage = language;
            }
        }
        double averageYear = (double) totalYears / languages.size();

        return Map.of(
                "totalLanguages", languages.size(),
                "beginnerCount", beginnerCount,
                "intermediateCount", intermediateCount,
                "advancedCount", advancedCount,
                "averageYearCreated", averageYear,
                "oldestLanguage", oldestLanguage.getName(),
                "newestLanguage", newestLanguage.getName()
        );

    }

    //Endpoint 10: recommendation endpoint
    @GetMapping("/languages/recommend")
    public ResponseEntity<ProgrammingLanguage> recommendLanguage(@RequestParam String goal) {
        // loop through languages
        for (ProgrammingLanguage language : languages){
            // compare goal with mainUse
            if(language.getMainUse().toLowerCase().contains(goal.toLowerCase())){
                return ResponseEntity.ok(language);
            }
        }
        //handle when no recommendation matches
        return ResponseEntity.notFound().build();
    }



    }
