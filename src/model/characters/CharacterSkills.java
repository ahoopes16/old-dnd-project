package model.characters;

import java.util.Arrays;

/**
 * Created by Dustin on 7/5/2017.
 */
public class CharacterSkills {
    private final String[] SKILL_NAMES = {
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
        skillsList = new Skill[SKILL_NAMES.length];

        for (int i = 0; i < SKILL_NAMES.length; i++)
        {
            skillsList[i] = (new Skill(SKILL_NAMES[i],0, false));
        }
    }

    public Skill[] getSkillsList() {
        return skillsList;
    }

    public void trainSkill(String skillName){
        Skill skill = skillsList[Arrays.binarySearch(SKILL_NAMES, skillName)];
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
            Skill skill = skillsList[Arrays.binarySearch(SKILL_NAMES, skillName)];
            skill.updateSkillLevel(levels);
        }
    }
    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("Character Skills:\n");

        for(Skill skill: skillsList)
            text.append("- " + skill.toString() + "\n");

        return text.toString();
    }
}
