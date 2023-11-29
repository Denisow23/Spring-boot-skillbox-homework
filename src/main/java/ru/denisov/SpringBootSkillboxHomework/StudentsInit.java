package ru.denisov.SpringBootSkillboxHomework;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@RequiredArgsConstructor
public class StudentsInit {
    private final StudentsList studentsList;

    @EventListener(ApplicationStartedEvent.class)
    public void defaultInit(){
        studentsList.addStudent("Daniil", "Denisov", 19);
        studentsList.addStudent("Valiliy", "Vasiliev", 22);
        studentsList.addStudent("Ivan", "Ivanov", 23);
        studentsList.addStudent("John", "Bekker", 18);
        studentsList.addStudent("Olga", "Tsvetkova", 25);
        studentsList.addStudent("Oleg", "Alekseev", 21);
        studentsList.addStudent("Aleksey", "Sidorov", 19);
    }
}
