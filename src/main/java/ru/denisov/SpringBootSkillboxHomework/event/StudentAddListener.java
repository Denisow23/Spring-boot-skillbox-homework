package ru.denisov.SpringBootSkillboxHomework.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StudentAddListener {

    @EventListener(StudentAdd.class)
    public void listen(StudentAdd studentAdd){
        System.out.println(studentAdd.getStudent() + "was added !");
    }
}
