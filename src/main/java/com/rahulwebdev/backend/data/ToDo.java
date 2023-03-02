package com.rahulwebdev.backend.data;
import org.springframework.data.annotation.Id;
public class ToDo {
    private String id;
    private String title;
    private boolean completed;

    public ToDo() {
    }

    public ToDo(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
