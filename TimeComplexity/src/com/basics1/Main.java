package com.basics1;

public class Main {

    // creates a list of random numbers
    public static int[] randGen(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    // creates an array of numbers in order
    public static int[] ordered(int n){
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        return arr;
    }

    // creates a list of random repeated numbers
    public static int[] repeated(int n){
        int[] arr = new int [n];
        int index = 0;
        while(index < n){
            arr[index] = (int)(Math.random()*10);
            index++;
        }
        return arr;
    }
    // prints the array
    public static void printArray(int[] arr){
        System.out.print(arr[0]);
        for(int i = 1; i < arr.length; i++){
            System.out.print(", " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
    int n = 9000;
    // Tests the repeated numbers in an array for quick sort
    int[] qrTest = repeated(n);
    long startTime = System.nanoTime();  //Current System Time at start
    Quick.sort(qrTest);
    long endTime = System.nanoTime(); //Current system Time at end
    long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
    printArray(qrTest);
    System.out.println(duration + "ns");

    // Tests the repeated numbers in an array for merge sort
    int[] mrTest = repeated(n);
    startTime = System.nanoTime();  // Current System Time at start
    Merge.sort(mrTest);
    endTime = System.nanoTime(); // Current system Time at end
    duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
    printArray(mrTest);
    System.out.println(duration + "ns");

    // Tests the repeated numbers in an array for insertion sort
    int[] irTest = repeated(n);
    startTime = System.nanoTime();  // Current System Time at start
    Insert.sort(irTest);
    endTime = System.nanoTime(); // Current system Time at end
    duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
    printArray(irTest);
    System.out.println(duration + "ns");

    // Tests the ordered numbers in an array for quick sort
    int[] qoTest = ordered(n);
    startTime = System.nanoTime();  // Current System Time at start
    Quick.sort(qoTest);
    endTime = System.nanoTime(); // Current system Time at end
    duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
    printArray(qoTest);
    System.out.println(duration + "ns");

    // Tests the ordered numbers in an array for merge sort
    int[] moTest = ordered(n);
    startTime = System.nanoTime();  // Current System Time at start
    Merge.sort(moTest);
    endTime = System.nanoTime(); // Current system Time at end
    duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
    printArray(moTest);
    System.out.println(duration + "ns");

    // Tests the ordered numbers in an array for insertion sort
    int[] ioTest = ordered(n);
    startTime = System.nanoTime();  // Current System Time at start
    Insert.sort(ioTest);
    endTime = System.nanoTime(); // Current system Time at end
    duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
    printArray(ioTest);
    System.out.println(duration + "ns");

    // Tests the random numbers in an array for quick sort
    int[] qranTest = randGen(n);
    startTime = System.nanoTime();  // Current System Time at start
    Quick.sort(qranTest);
    endTime = System.nanoTime(); // Current system Time at end
    duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
    printArray(qranTest);
    System.out.println(duration + "ns");

    // Tests the random numbers in an array for merge sort
    int[] mranTest = randGen(n);
    startTime = System.nanoTime();  // Current System Time at start
    Merge.sort(mranTest);
    endTime = System.nanoTime(); // Current system Time at end
    duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
    printArray(mranTest);
    System.out.println(duration + "ns");

    // Tests the random numbers in an array for insertion sort
    int[] iranTest = randGen(n);
    startTime = System.nanoTime();  // Current System Time at start
    Insert.sort(iranTest);
    endTime = System.nanoTime(); // Current system Time at end
    duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
    printArray(iranTest);
    System.out.println(duration + "ns");
    }
}
