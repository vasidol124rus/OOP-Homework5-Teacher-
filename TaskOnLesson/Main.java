package TaskOnLesson;

import TaskOnLesson.data.Student;
import TaskOnLesson.data.Teacher;
import TaskOnLesson.view.StudentView;
import TaskOnLesson.view.TeacherView;

public class Main {
    
    public static void main(String[] args) {
        
        Student stud1 = new Student("Иван ", 18, "Информатика");
        Student stud2 = new Student("Петр ", 19, "Разработчик");
        Teacher teach1 = new Teacher("Сергей", 39, "Разработка" );
        Teacher teach2 = new Teacher("Анна", 29, "Информационные технологии" );

        StudentView stView = new StudentView();
        TeacherView tchView = new TeacherView();
        

        stView.createStudent(stud1);
        stView.createStudent(stud2);
        stView.readStudent();
        
        System.out.println();

        tchView.createTeacher(teach1);
        tchView.createTeacher(teach2);
        tchView.readTeacher();
    }
    
}
