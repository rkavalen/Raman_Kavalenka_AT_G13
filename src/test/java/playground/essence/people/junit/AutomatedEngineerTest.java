package playground.essence.people.junit;

import org.junit.Test;
import playground.essence.people.AutomatedEngineer;

import static org.junit.Assert.assertEquals;

public class AutomatedEngineerTest {
    @Test
    public void getAgeTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 5);
        assertEquals("getAgeTest failure", 25, automatedEngineer.getAge());
    }

    @Test
    public void getExperienceTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 5);
        assertEquals("getExperienceTest failure", 5, automatedEngineer.getExperience());
    }

    @Test
    public void getSkillTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 5);
        assertEquals("getSkillTest failure", 15, automatedEngineer.getSkill());
    }

    @Test
    public void setAgeTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 5);
        automatedEngineer.setAge(26);
        assertEquals("setAgeTest failure", 26, automatedEngineer.getAge());
    }

    @Test
    public void setExperienceTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 5);
        automatedEngineer.setExperience(6);
        assertEquals("setExperienceTest failure", 6, automatedEngineer.getExperience());
    }

    @Test
    public void setSkillTest() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25, 5);
        automatedEngineer.setSkill(16);
        assertEquals("getSkillTest failure", 16, automatedEngineer.getSkill());
    }
}
