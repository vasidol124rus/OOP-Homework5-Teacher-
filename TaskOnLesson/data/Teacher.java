package TaskOnLesson.data;

public class Teacher extends User {
    private String discipline;

    public String getDiscipline() {
        return discipline;
    }
    
    public Teacher() {
    }

    public Teacher(String name, int age, String discipline) {
        super(name, age);
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "discipline='" + discipline + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}' ;
    }
}
