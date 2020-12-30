package com.tnd.test.ioc.reflection.impl;

import com.tnd.test.ioc.reflection.MessageService;

public class MailService implements MessageService {

    public String sendMessage() {
        return "Mail Message....";
    }
}
