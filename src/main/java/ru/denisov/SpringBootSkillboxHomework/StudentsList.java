package ru.denisov.SpringBootSkillboxHomework;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import ru.denisov.SpringBootSkillboxHomework.event.StudentAdd;
import ru.denisov.SpringBootSkillboxHomework.event.StudentDel;

import java.util.HashMap;
import java.util.Map;

@ShellComponent
@RequiredArgsConstructor
public class StudentsList {

    private final Map<Long, Student> studentList = new HashMap<>();
    private final ApplicationEventPublisher publisher;
    private static long id = 0;

    @ShellMethod(key = "add")
    public void addStudent(@ShellOption(value = "name") String firstName
            , @ShellOption(value = "ln") String lastName
            , @ShellOption(value = "age") int age) {

        Student st = new Student(firstName, lastName, age);
        if (!studentList.containsValue(st)) {
            st.setId(++id);
            studentList.put(st.getId(), st);
            publisher.publishEvent(new StudentAdd(this, st));
        } else {
            System.out.println("such a student already exists!");
        }

    }

    @ShellMethod(key = "del")
    public void deleteStudent(@ShellOption(value = "id") long id) {
        if (studentList.containsKey(id)) {
            Student student = studentList.remove(id);
            publisher.publishEvent(new StudentDel(this, id));
        } else {
            System.out.println("This id doesn`t exists!");
        }

    }

    @ShellMethod(key = "print")
    public void printStudentList() {
        if (studentList.size() != 0) {
            for (Map.Entry<Long, Student> entry : studentList.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue());
            }
        } else {
            System.out.println("Students list is empty!");
        }
    }

    @ShellMethod(key = "clearAll")
    public void clearStudentsList() {
        if (studentList.size() != 0) {
            studentList.clear();
            System.out.println("Students list has been cleared!");
        } else {
            System.out.println("Students list is already empty!");
        }

    }

}
