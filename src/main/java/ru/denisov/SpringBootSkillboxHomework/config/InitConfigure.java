package ru.denisov.SpringBootSkillboxHomework.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.denisov.SpringBootSkillboxHomework.StudentsInit;
import ru.denisov.SpringBootSkillboxHomework.StudentsList;

@Configuration
@ConditionalOnProperty("app.init")
public class InitConfigure {

    @Bean
    public StudentsInit StudentsInit(StudentsList studentsList){
        return new StudentsInit(studentsList);
    }
}
