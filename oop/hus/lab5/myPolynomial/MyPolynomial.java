package oop.hus.lab5.myPolynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial() {
    }

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public void setCoeffs(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public double evaluate(double x) {
        double result = this.coeffs[this.coeffs.length - 1];
        for (int i = this.coeffs.length - 2; i >= 0; i--) {
            result = result * x + this.coeffs[i];
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        int minDegree = Math.min(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];
        for (int i = 0; i <= minDegree; i++) {
            newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        if (this.getDegree() > right.getDegree()) {
            for (int i = minDegree + 1; i <= maxDegree; i++) {
                newCoeffs[i] = this.coeffs[i];
            }
        }
        if (this.getDegree() < right.getDegree()) {
            for (int i = minDegree + 1; i <= maxDegree; i++) {
                newCoeffs[i] = right.coeffs[i];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] newcoeffs = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                newcoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newcoeffs);
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = this.coeffs.length - 1; i > 0; i--) {
            if (i == 1) {
                result.append(coeffs[i]).append("x").append(" + ");
            } else {
                result.append(this.coeffs[i]).append("x^").append(i).append(" + ");
            }
        }
        result.append(this.coeffs[0]);
        return result.toString();
    }
}
