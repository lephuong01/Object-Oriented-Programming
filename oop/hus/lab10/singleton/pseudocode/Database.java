package oop.hus.lab10.singleton.pseudocode;


public class Database {
    private static Database instance;

    private Database() {

    }

    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Excute:" + sql);
    }
}
