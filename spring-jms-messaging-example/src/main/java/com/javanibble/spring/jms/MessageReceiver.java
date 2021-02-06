package com.javanibble.spring.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(EmailMessage email) {
        System.out.println("Received <" + email + ">");
    }

}
