package com.tnd.test.ioc.reflection;

import com.tnd.test.ioc.reflection.impl.MailService;
import org.springframework.context.annotation.Bean;

public class Configuration {

    @Bean
    public MessageService animalService() {
        return new MailService();
    }

//    @Bean
//    public Controller controller(AnimalService animalService) {
//        return new Controller(animalService);
//    }

    @Bean Controller controller() {
        return new Controller();
    }
}
