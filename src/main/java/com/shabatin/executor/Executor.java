package main.java.com.shabatin.executor;

import main.java.com.shabatin.builder.User;
import main.java.com.shabatin.singleton.Singleton;

public class Executor {

    public void start(){
        User user = User.builder()
                .setFirstName("Anton")
                .setLastName("Shabatin")
                .setAge(26)
                .setCity("Dnipro")
                .build();

        System.out.println(user.toString());

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1.equals(singleton2));
    }
}
