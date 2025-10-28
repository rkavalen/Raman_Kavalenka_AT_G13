package playground.essence.people;

public class AutomatedEngineer extends Engineer {
    public AutomatedEngineer(int age, int experience) {
        super(age);
        setExperience(experience);
        setSkill(experience * 3);
    }
}
