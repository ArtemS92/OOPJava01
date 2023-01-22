package Task_3_3;



public class Main {
    public static void main(String[] args) {
        Human h = new Human("Игорь");

        Cat c = new Cat("Барсик");
        System.out.printf("%s зовет %sа кушать: ",h.name, c.getNickname());
        h.getAction();
        c.getVoice();

    }




}
