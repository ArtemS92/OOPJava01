package Task_3_2;


public class Main {

    public static void main(String[] args) {


        Wardrobe shelf = new Wardrobe();
        Wife wife = new Wife("Маша");
        Husband man = new Husband("Вася");
        System.out.printf("%s спрашивает разрешение у жены %s открыть шкаф: ", man, wife);
        System.out.println();
        man.getAccess(shelf);
        shelf.getState(man);
    }
}
