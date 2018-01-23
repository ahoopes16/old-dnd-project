package model.characters;

import model.characters.enums.CharacterSize;
import model.characters.enums.CharacterAlignment;

/*
 * A class that holds the demographics of a character
 */
public class Demographics 
{
	private CharacterSize size;
    private int age;
    private int weight;
    private String height;
    private String gender;
    private String eyes;
    private String hair;
    private String skin;

    public Demographics(CharacterSize size, int age, int weight, String height, String gender, String eyes, String hair, String skin) {
        this.size = size;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.eyes = eyes;
        this.hair = hair;
        this.skin = skin;
    }

    public CharacterSize getSize() {
        return size;
    }

    public void setSize(CharacterSize size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    @Override
    public String toString() {
        return  "\n  Size: " + size +
                "\n  Age: " + age  +
                "\n  Weight: " + weight +
                "\n  Height: " + height +
                "\n  Gender: " + gender +
                "\n  Eyes: " + eyes +
                "\n  Hair: " + hair +
                "\n  Skin: " + skin;
    }
}
