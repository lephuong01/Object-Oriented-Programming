package oop.hus.lab10.singleton.chocolate;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiler;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiler = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isBoiler() {
        return boiler;
    }

    public void setBoiler(boolean boiler) {
        this.boiler = boiler;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (!isEmpty()) {
            empty = false;
            boiler = false;
        }
    }

    public void drain() {
        if (!isEmpty() && !isBoiler()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiler()) {
            boiler = true;
        }
    }

}
