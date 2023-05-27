package oop.hus.lab6.person;

public class TestMain {
    public static void main(String[] args) {
        Person person1 = new Person("Phuong", "Thanh Hoa");
        System.out.println("Person:" + " name = " + person1.getName() + ", adress = " + person1.getAddress());

        Student student1 = new Student("Lan", "Ha Noi", "Java", 2023, 10);
        System.out.println("Student:" + " name = " + student1.getName() + ", adress = " + student1.getAddress() + ", program = " + student1.getProgram() + ", year = " + student1.getYear() + ", free = " + student1.getFee());

        Staff staff1 = new Staff("Hong", "Ho Chi Minh", "Khoa hoc tu nhien", 100);
        System.out.println("Staff:" + " name = " + staff1.getName() + ", address = " + staff1.getAddress() + ", school = " + staff1.getSchool() + ", pay = " + staff1.getPay());
    }
}
