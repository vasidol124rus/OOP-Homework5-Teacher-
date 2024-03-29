// Задача 3 - View/Dto
// � Создать package – view. Работу продолжаем в нем
// � Создать класс StudentView, содержащий в себе метод вывода в консоль
// данных студента поданных на вход

package TaskOnLesson.view;

import TaskOnLesson.controller.Controller;
import TaskOnLesson.data.Student;

public class StudentView {
    private Controller controller = new Controller();

    public void createStudent(Student stud) {
        controller.createUser(stud, stud.getDirection());
        System.out.println("Студент создан успешно");
    }

    public void readStudent() {
        System.out.println("Список студентов: ");
        controller.read("student");
        
    }

}
