package model.characters;

public class Skill
{
    private String skillName;
    private Integer skillLevel;
    private boolean isTrained;

    public Skill(String skillName, Integer skillLevel, boolean isTrained) {
        this.skillName = skillName;
        this.skillLevel = skillLevel;
        this.isTrained = isTrained;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Integer getSkillLevel() {
        return skillLevel;
    }

    public void updateSkillLevel(Integer skillLevel) {
        this.skillLevel += skillLevel;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public String toString() {
        return skillName + " is level " + skillLevel + " and isTrained: " + isTrained;
    }
}
