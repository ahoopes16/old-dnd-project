package model.characters;

public class Motivation {
    private String name;
    private String description;

    public Motivation(String name) {
        this.name = name;
        this.description = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
