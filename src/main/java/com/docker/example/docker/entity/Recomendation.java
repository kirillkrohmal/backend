package com.docker.example.docker.entity;


import javax.persistence.*;

@Table(name = "recomendations")
@Entity
public class Recomendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "title", length = 45)
    private String title;

    @Column(name = "salary", length = 45)
    private int salary;

    @Column(name = "description", length = 255)
    private String description;

    public Recomendation() {
    }

    public Recomendation(int id, String title, int salary, String description) {
        this.id = id;
        this.title = title;
        this.salary = salary;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
