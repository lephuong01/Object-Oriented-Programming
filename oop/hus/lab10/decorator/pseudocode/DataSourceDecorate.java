package oop.hus.lab10.decorator.pseudocode;

public class DataSourceDecorate implements DataSource{
    private DataSource wrappee;

    public DataSourceDecorate(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
