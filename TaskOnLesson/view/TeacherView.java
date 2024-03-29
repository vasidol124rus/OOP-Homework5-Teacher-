package TaskOnLesson.view;

import TaskOnLesson.controller.Controller;
import TaskOnLesson.data.Teacher;

public class TeacherView {
    private Controller controller = new Controller();

    public void createTeacher(Teacher teach) {
        controller.createUser(teach, teach.getDiscipline());
        System.out.println("Преподаватель успешно создан");
    }

    public void readTeacher() {
        System.out.println("Список преподавателей: ");
        controller.read("teacher");
        
    }

}

