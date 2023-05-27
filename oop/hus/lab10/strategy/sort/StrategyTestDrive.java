package oop.hus.lab10.strategy.sort;


public class StrategyTestDrive {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        System.out.println("Using Bubble Sort:");
        System.out.println("Before Sort:");
        System.out.println(dataSet);

        dataSet.setStrategy(new BubbleSort());
        System.out.println("After Sort");
        dataSet.sort();
        System.out.println(dataSet);

        System.out.println("\nUsing Insertion sort: ");
        System.out.println("Before Sort:");
        dataSet.reset();
        System.out.println(dataSet);

        dataSet.setStrategy(new InsertionSort());
        System.out.println("After Sort:");
        dataSet.sort();
        System.out.println(dataSet);

        System.out.println("\nUsing Seclection Sort:");
        System.out.println("Before Sort:");
        dataSet.reset();
        System.out.println(dataSet);

        dataSet.setStrategy(new SelectionSort());
        System.out.println("After Sort:");
        dataSet.sort();
        System.out.println(dataSet);

    }
}
