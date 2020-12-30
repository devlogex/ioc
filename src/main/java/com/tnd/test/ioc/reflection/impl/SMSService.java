package com.tnd.test.ioc.reflection.impl;

import com.tnd.test.ioc.reflection.MessageService;

public class SMSService implements MessageService {
    public String sendMessage() {
        return "SMS Message......";
    }
}
