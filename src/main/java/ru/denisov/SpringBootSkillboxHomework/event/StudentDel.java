package ru.denisov.SpringBootSkillboxHomework.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class StudentDel extends ApplicationEvent {

    private final long id;

    public StudentDel(Object source, long id) {
        super(source);
        this.id = id;
    }
}
