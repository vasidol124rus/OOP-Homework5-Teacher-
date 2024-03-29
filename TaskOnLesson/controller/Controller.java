package TaskOnLesson.controller;
// Задача 4 - Controller
// � Создать package – controller. Работу продолжаем в нем
// � Создать класс Controller агрегирующий в себе необходимые классы в виде
// полей, а инициализируем прям в поле.
// � Создаем метод созданиеСтудента – реализующий логику, путем вызова
// соответствующих методов интерфейсов:
// � Создания Студента в сервисе
// � Возвращение всех студентов в сервисе
// � Вызов view и передача списка найденных студентов

import TaskOnLesson.data.User;
import TaskOnLesson.service.DataService;

public class Controller {

    private DataService dataServ = new DataService();

    public void createUser(User user, String type){
        dataServ.createUser(user, type);

    }

    public void read(String type){
        System.out.println(dataServ.read(type));
    }
}
