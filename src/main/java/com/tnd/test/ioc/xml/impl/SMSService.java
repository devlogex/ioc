package com.tnd.test.ioc.xml.impl;

import com.tnd.test.ioc.xml.MessageService;

public class SMSService implements MessageService {

    public String sendMessage() {
        return "SMS Message......";
    }
}
