package com.example.recyclerview;

public class Items {
    private int image;
    private String titre;
    private String description;

    public Items(int image, String titre, String description){
        this.image = image;
        this.titre = titre;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }
}
