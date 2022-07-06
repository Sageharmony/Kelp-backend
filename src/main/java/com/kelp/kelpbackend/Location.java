package com.kelp.kelpbackend;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Location {   
private @Id @GeneratedValue Long id; 
private String name;
private String about;
private String vibe;
private String latitude;
private String longitude;
private String hours;
private Boolean loud;
private String seating;
private String image;
private Integer vegan;

Location() {}

Location(String name, String about, String vibe, String latitude, String longitude, String hours, Boolean loud, String seating, String image, Integer vegan) {

    this.name = name;
    this.about = about;
    this.vibe = vibe;
    this.latitude = latitude;
    this.longitude = longitude;
    this.hours = hours;
    this.loud = loud;
    this.seating = seating;
    this.image = image;
    this.vegan = vegan;
}
    
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


     public String getAbout() {
        return this.about;
    } 
    public void setAbout(String about) {
        this.about = about;
    }


    public String getVibe() {
        return  this.vibe;
    }
    public void setVibe(String vibe) {
        this.vibe = vibe;
    }


    public String getHours() {
        return  this.hours;
    }
    public void setHours(String hours) {
        this.hours = hours;
    }


    public Boolean getLoud() {
        return  this.loud;
    }
    public void setLoud(Boolean loud) {
        this.loud = loud;
    }


    public String getLatitude() {
        return  this.latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    public String getLongitude() {
        return  this.longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getSeating() {
        return  this.seating;
    }
    public void setSeating(String seating) {
        this.seating = seating;
    }

    public String getImage() {
        return  this.image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    
    public Integer getVegan() {
        return  this.vegan;
    }
    public void setVegan(Integer vegan) {
        this.vegan = vegan;
    }
   
    @Override 
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if(!(o instanceof Location))
            return false;
        Location location = (Location) o;
        return Objects.equals(this.id, location.id) && Objects.equals(this.name, location.name)
            && Objects.equals(this.about, location.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.about, this.vibe, this.latitude, this.longitude, this.hours, this.loud, this.seating, this.image, this.vegan);
    }

    @Override
    public String toString() {
        return "Location{" + "id=" + this.id + '\'' + " ,name='" + this.name + '\'' + ", about='" + this.about + '\'' + ", vibe=" + this.vibe + '\'' + ", latitude=" + this.latitude + '\'' + ", longitude=" + this.longitude + '\'' + ", hours=" + this.hours +'\''  + ", seating=" + this.seating  +'\''  + ", image=" + this.image + '}'; 
    }

    public void setId(Long id2) {
    }
}
