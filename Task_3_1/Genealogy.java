package Task_3_1;

import java.util.ArrayList;

public class Genealogy {

    public static void main(String[] args) {
        //отец h12
        Human h1 = new Human();
        h1.id = 1;
        h1.fn = "Игорь";
        h1.ln = "Петров";

        //сын от h1
        Human h12 = new Human();
        h12.id = 2;
        h12.fn = "Саша";
        h12.ln = "Петров";

        //сын от h1
        Human h13 = new Human();
        h13.id = 5;
        h13.fn = "Максим";
        h13.ln = "Петров";

        //мама h12
        Human h3 = new Human();
        h3.id = 3;
        h3.fn = "Света";
        h3.ln = "Иванова";

        //внук от h1 (сын h12)
        Human h22 = new Human();
        h22.id = 4;
        h22.fn = "Петя";
        h22.ln = "Петров";

        //родители
        h13.dad = h1;
        h13.mom = h3;
        h22.dad = h13;

        //дети
        h1.childs.add(h12);
        h3.childs.add(h12);
        h1.childs.add(h13);
        h3.childs.add(h13);

        h12.childs.add(h22);

        //Iterr.ViewForward(h22, "");
        StringBuilder sb = new StringBuilder();
        String str = "";
        Iterr.ViewReverse(h1, sb, str);
        System.out.println(sb);
    }
}

class Human {
    int id;
    String fn;
    String ln;

    ArrayList<Human> childs = new ArrayList<>();
    Human mom;
    Human dad;
}

class Iterr {
    static void ViewForward(Human n, String space) {
        if (n != null) {
            System.out.printf("%s%s %s %s\n", space, n.id, n.fn, n.ln);

            if (n.dad != null) {
                ViewForward(n.dad, space + " ");
            }
            if (n.mom != null) {
                ViewForward(n.mom, space + " ");
            }
        }
    }

    static void ViewReverse(Human n, StringBuilder sb, String str) {
        if (n != null) {
            sb.append(String.format("%sid:%d fn:%s ln:%s\n", str, n.id, n.fn, n.ln));
            if (!n.childs.isEmpty()) {
                str += ' ';
                for (Human child : n.childs) {
                    ViewReverse(child, sb, str);
                }
            }
        }
    }
}
