package edu.ait.winemanager.dto;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Wine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min = 4, max = 50, message = "Name must be between 4 and 50 characters")
    private String name;
    private int year;
    private String grapes;
    private String country;
    private String region;
    @Lob
    @Size(min = 30, max = 500, message = "Description must be between 30 and 500 characters")
    private String description;
    private String picture;

    public Wine() {
    }

    public Wine(Integer id, String name, int year, String grapes, String country, String region, String description, String picture) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.grapes = grapes;
        this.country = country;
        this.region = region;
        this.description = description;
        this.picture = picture;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGrapes() {
        return grapes;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGrapes(String grapes) {
        this.grapes = grapes;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", grapes='" + grapes + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
