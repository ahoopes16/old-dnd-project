package model;
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

    @Override
    public String toString() {
        return "\nDemographics:" + '\n' +
                "- size=" + size + '\n' +
                "- age=" + age + '\n' +
                "- weight=" + weight + '\n' +
                "- height='" + height + '\n' +
                "- gender='" + gender + '\n' +
                "- eyes='" + eyes + '\n' +
                "- hair='" + hair + '\n' +
                "- skin='" + skin;
    }
}
