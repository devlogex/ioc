package com.tnd.test.ioc.xml;

public class Controller {
    private MessageService messageService;

//    public Controller(AnimalService animalService) {
//        this.animalService = animalService;
//    }

    public String send() {
        return messageService.sendMessage();
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
