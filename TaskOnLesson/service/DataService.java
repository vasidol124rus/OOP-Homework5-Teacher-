package TaskOnLesson.service;

import TaskOnLesson.data.Student;
import TaskOnLesson.data.Teacher;
import TaskOnLesson.data.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> studentList = new ArrayList<>();
    private List<User> teacherList = new ArrayList<>();

    public void createUser(User user, String type){
        if (user instanceof Student){
            studentList.add(new Student(user.getName(), user.getAge(), type));
        }else {
            teacherList.add(new Teacher(user.getName(), user.getAge(), type));
        }
    }

    public List<User> read(String type){
        if (type.equals("student")){
            return studentList;
        }else if (type.equals("teacher")){
            return teacherList;
        }
        System.out.println("не найдено!");
        return null;
    }
}
