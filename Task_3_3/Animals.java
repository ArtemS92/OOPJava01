package Task_3_3;

import java.util.Random;

public class Animals {
    String nickname;
    Random r = new Random();

    void getVoice() {
        System.out.println("В зависимости от животного");
    }
}

class Cat extends Animals {

    Cat(String nickname) {

        this.nickname = nickname;
    }

    String getNickname() {
        return this.nickname;
    }

    @Override
    void getVoice() {
        int t = r.nextInt(3);
        if (t == 0) {
            System.out.println("Мур *бежит*");
        } else if (t == 1) {
            System.out.println("Мяу *не хочет*");
        } else {
            System.out.println("*равнодушно продолжает свои дела*");
        }
    }
}


