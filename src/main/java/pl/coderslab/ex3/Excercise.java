package pl.coderslab.ex3;

import pl.coderslab.advanced.dao.simple.exercise.Model;

public class Excercise implements Model {

    private Long id;
    private String title;
    private String description;

    public Excercise(String title, String description) {
        this(null, title, description);
    }


    public Excercise(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Excercise() {
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(long id) {
        this.id = id;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
