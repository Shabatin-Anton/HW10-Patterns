package main.java.com.shabatin.executor;

import main.java.com.shabatin.builder.User;

public class Executor {

    public void start(){
        User user = User.builder()
                .setFirstName("Anton")
                .setLastName("Shabatin")
                .setAge(26)
                .setCity("Dnipro")
                .build();

        System.out.println(user.toString());
    }
}
