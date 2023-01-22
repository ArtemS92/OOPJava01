package Task_3_2;


public class Wardrobe {

    enum Door {
        Open,
        Close;
    }

    protected Door state;

    public Wardrobe() {
        this.state = Door.Close;
    }

    public void getState(Husband man) {
        if (state == Door.Open) {
            System.out.printf("%s открывает дверцу шкафа", man.name);
        } else {
            System.out.println("Дверца осталась закрыта");
        }
    }

    protected void setState() {
        if (this.state == Door.Close) {
            this.state = Door.Open;

        } else {
            this.state = Door.Close;
        }
    }
}

