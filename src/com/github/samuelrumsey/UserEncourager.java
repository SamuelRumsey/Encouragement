package com.github.samuelrumsey;

import java.util.Random;

class UserEncourager {

    private Random random = new Random();

    private String[] introductions = {
            "Hi",
            "Hello",
            "Hey"
    };

    private String[] compliments = {
            "you're pretty cool",
            "you are looking great today",
            "good work so far"
    };

    private String[] endings = {
            "Have a great day",
            "See you later",
            "Talk to you next time"
    };

    void encourageUser(User user) {
        String introduction = getRandomIntroduction();
        String compliment = getRandomCompliment();
        String ending = getRandomEnding();

        String fullMessage =
                introduction
                + " " + user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName() + ", "
                + compliment + ". "
                + ending + "!";

        System.out.println(fullMessage);
    }

    private String getRandomIntroduction() {
        return introductions[random.nextInt(introductions.length)];
    }

    private String getRandomCompliment() {
        return compliments[random.nextInt(compliments.length)];
    }

    private String getRandomEnding() {
        return endings[random.nextInt(endings.length)];
    }
}
