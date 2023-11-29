package ru.denisov.SpringBootSkillboxHomework.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import ru.denisov.SpringBootSkillboxHomework.Student;

@Getter
public class StudentAdd extends ApplicationEvent {

    private final Student student;

    public StudentAdd(Object source, Student student) {
        super(source);
        this.student = student;
    }
}
