package com.youboy.mqtest.spring2;

import org.springframework.context.ApplicationContext;

public class SenderTest {
    public static void main(String[] args) {
        ApplicationContext context = SpringUtils.getApplicationContext();
        Sender sender = (Sender) context.getBean("sender");
        sender.sendInfo();
    }
}