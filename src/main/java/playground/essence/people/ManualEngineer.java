package playground.essence.people;

public class ManualEngineer extends Engineer {
    public ManualEngineer(int age, int experience) {
        super(age);
        setExperience(experience);
        setSkill(experience * 2);
    }
}
