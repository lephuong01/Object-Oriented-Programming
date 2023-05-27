package oop.hus.lab10.decorator.pseudocode;

public class Application {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\\nJohn Smith, 100000\\nSteven Jobs, 912000";
        DataSource source = new FileDataSource("somefile.dat");
        DataSourceDecorate encoded = new CompressionDecorator(new EncryptionDecorator(source));
        encoded.writeData(salaryRecords);

        System.out.println("-----Input-------");
        System.out.println(salaryRecords);
        System.out.println("-----Encoded------");
        System.out.println(source.readData());
        System.out.println("-----Decoded------");
        System.out.println(encoded.readData());
    }

    public void dumbUsageExample() {

    }

}
