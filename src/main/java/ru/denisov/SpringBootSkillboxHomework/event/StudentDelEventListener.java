package ru.denisov.SpringBootSkillboxHomework.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
public class StudentDelEventListener {

    @EventListener(StudentDel.class)
    public void listen(StudentDel studentDel){
        System.out.println(MessageFormat.format("Student with id: {} was deleted", studentDel.getId()));
    }
}
