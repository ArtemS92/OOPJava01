package Task_3_2;

public class Husband {
    String name;

    public Husband(String name) {
        this.name=name;
    }
    public void getAccess(Wardrobe shelf){
        System.out.println("-Можно я залезу в твой шкаф?");
        if(Wife.getPermission()){
            shelf.setState();
            System.out.printf("-Да, %s, и достань чистое полотенце.", this.name);
            System.out.println();
        } else {
            System.out.println("-Не сегодня");
        }
    }

    @Override
    public String toString() {
        return String.format("%s",name);
    }

}





