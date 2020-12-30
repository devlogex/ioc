package com.tnd.test.ioc.reflection;

import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
    @Autowired
    private MessageService messageService;

    public Controller() {
    }

//    public Controller(AnimalService animalService) {
//        this.animalService = animalService;
//    }

    public String send() {
        return messageService.sendMessage();
    }
}
