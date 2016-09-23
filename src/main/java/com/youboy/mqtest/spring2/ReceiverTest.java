package com.youboy.mqtest.spring2;

import org.springframework.context.ApplicationContext;

public class ReceiverTest {
    public static void main(String[] args) {
        // TODO 自动生成方法存根
        ApplicationContext context = SpringUtils.getApplicationContext();
        Receiver receiver = (Receiver) context.getBean("receiver");
        System.out.print(receiver.receiveMessage());
    }
}