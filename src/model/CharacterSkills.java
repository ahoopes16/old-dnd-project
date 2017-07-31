package model;

import java.util.Arrays;

/**
 * Created by Dustin on 7/5/2017.
 */
public class CharacterSkills {
    private String[] skillNames = {
            "Acrobatics",
            "Animal Handling",
            "Arcana",
            "Athletics",
            "Deception",
            "History",
            "Insight",
            "Intimidation",
            "Investigation",
            "Medicine",
            "Nature",
            "Perception",
            "Performance",
            "Persuasion",
            "Performance",
            "Religion",
            "Slight of Hand",
            "Stealth",
            "Survival"
    };
    private Skill[] skillsList;

    public CharacterSkills() {
        skillsList = new Skill[skillNames.length];{
        }
        for (int i = 0; i < skillNames.length; i++)
        {
            skillsList[i] = (new Skill(skillNames[i],0, false));
        }
    }

    public Skill[] getSkillsList() {
        return skillsList;
    }

    public void trainSkill(String skillName){
        Skill skill = skillsList[Arrays.binarySearch(skillNames, skillName)];
        if(skill.isTrained()){
            //Temporary
            System.out.println("Skill already trained");
        }
        else{
            skill.updateSkillLevel(5);
            skill.setTrained(true);
        }
    }

    public void increaseSkill(String skillName, int levels){
        if(levels > 0) {
            Skill skill = skillsList[Arrays.binarySearch(skillNames, skillName)];
            skill.updateSkillLevel(levels);
        }
    }
    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("Character Skills:\n");
        for(Skill skill: skillsList)
        {
            text.append("- " + skill.toString() + "\n");
        }

        return text.toString();
    }
}
