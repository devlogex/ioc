package com.tnd.test.ioc.xml.impl;

import com.tnd.test.ioc.xml.MessageService;

public class MailService implements MessageService {
    public String sendMessage() {
        return "Mail Message ........";
    }
}
