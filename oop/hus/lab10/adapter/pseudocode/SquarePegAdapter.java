package oop.hus.lab10.adapter.pseudocode;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg adapter;


    public SquarePegAdapter(SquarePeg adapter) {
        super(0);
        this.adapter = adapter;
        setRadius((int)Math.sqrt(this.adapter.getWidth() * this.adapter.getWidth() / 2));
    }


    public int getRadius() {
        return (int)Math.sqrt(this.adapter.getWidth() * this.adapter.getWidth() / 2);
    }
}
