package playground.essence.people;

public abstract class Engineer extends Person {
    /**
     * покрыть юнит тестами все доступные методы для обьектов классов AutomatedEngineer и ManualEngineer
     * должно быть достигнуто 100% покрытие условий и альтернатив
     * тесты пишем и запускаем с использованием JUnit4 и TestNG, т.о. должно получиться 2 пакета с тестами
     * добавить в пом конфигурацию для Maven Surefire, чтобы запускать сразу все тесты из обоих наборов
     */
    private int skill;
    private int experience;

    public Engineer(int age) {
        super(age);
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
