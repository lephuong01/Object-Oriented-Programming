package oop.hus.lab5.myPolynomial;

public class TestPolynimial {
    public static void main(String[] args) {
        double[] coeffs = {1, 2, 3, 4};
        MyPolynomial myPolynomial = new MyPolynomial(coeffs);
        System.out.println(myPolynomial);

        System.out.println("Test avaluate: " + myPolynomial.evaluate(2));

        double[] coeffs2 = {2, 2, 1};
        MyPolynomial rightPolynomial = new MyPolynomial(coeffs2);
        MyPolynomial addPolynomial = myPolynomial.add(rightPolynomial);
        System.out.println("MyPolynomial " + myPolynomial);
        System.out.println("Right Polynomial: " + rightPolynomial);
        System.out.println("add Polynomial: " + addPolynomial);

        MyPolynomial multiplyPolynomial = myPolynomial.multiply(rightPolynomial);
        System.out.println("MultiplyPolynomial: " + multiplyPolynomial);
    }
}
