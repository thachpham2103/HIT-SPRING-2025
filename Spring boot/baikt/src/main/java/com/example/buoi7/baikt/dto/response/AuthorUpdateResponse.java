package com.example.buoi7.baikt.dto.response;

public class AuthorUpdateResponse {

    private String name;
    private int dod;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDod() {
        return dod;
    }

    public void setDod(int dod) {
        this.dod = dod;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
