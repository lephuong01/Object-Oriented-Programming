package oop.hus.lab5.exercise1_7;

public class TestMyComplex {
    public static void main(String[] args) {
        //object creation
        //creating 1st complex number
        MyComplex first_complex = new MyComplex(1.1,2.2);
        //creating 2nd complex number
        MyComplex second_complex = new MyComplex(3.3,4.4);

        /* Testing getters */
        System.out.println("Testing getter methods");
        System.out.println();
        //invokes getReal()
        System.out.println("Real part of first complex number is: " + first_complex.getReal());
        //invokes getImag() method
        System.out.println("Imaginary part of first complex number is: " + first_complex.getImag());
        //implicitly invokes toString() method to print complex number
        System.out.println("First complex number is: " + first_complex);
        //new line
        System.out.println();


        // Testing setter methods
        System.out.println("Testing setter methods");
        System.out.println();

        System.out.println("Testing setReal");
        //testing getter method
        System.out.println("Current real: " + first_complex.getReal());
        first_complex.setReal(5); //changes the real with setReal
        System.out.println("Changed radius: " + first_complex.getReal());
        System.out.println();

        System.out.println("Testing setImag");
        //calling of getImg method for testing
        System.out.println("Current real: " + first_complex.getImag());
        //calling of setImg method for setting new value
        first_complex.setImag(5);
        System.out.println("Altered radius: " + first_complex.getImag());
        System.out.println();

        System.out.println("Testing setValue");
        System.out.println("Current values: " + first_complex);
        //testing setValue() method
        first_complex.setValue(6, 6);
        System.out.println("Altered radius: " + first_complex);
        System.out.println();
        System.out.println("Testing add");
        System.out.println("Current values: " + first_complex);
        //testing and calling add() method
        MyComplex add_result = first_complex.addInto(second_complex);
        //implicitly printing the result
        System.out.println("Altered values: " + add_result);
        System.out.println();



        System.out.println("Testing divideBy() method");
        System.out.println("Present values: " + first_complex);

        //printing an empty line
        System.out.println();
        // Testing single return methods
        System.out.println("Testing return methods");
        System.out.println();
        //calls isReal method
        System.out.println("Testing isReal() method: " + first_complex.isReal());
        //calls isImaginary
        System.out.println("Testing isImaginary() method: " + first_complex.isImaginary());
        //invokes equals() method
        System.out.println("Testing equals() method: " + first_complex.equals(second_complex));
        //invokes magnitude() method
        System.out.println("Testing magnitude() method: " + first_complex.magnitude());
    }
}
