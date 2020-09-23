public ArrayExamples {
    /*
    7.1 Introduction

    -Array objects are data structures that are made up of items of the same type
    -Arrays have a fixed length. Dynamic resizing requires us to use the ArrayList class
    

    
    7.2 Arrays

    -Group of variables usually referred to as elements
    -Arrays are objects and therefore considered reference types, meaning our arrays 
    are really references to an Array object in memory
    -Position in the array is called the index and starts at 0 and must be a non-negative
    integer
    */


    //7.3 Declaring an Array

    // Making a new Array
    int[] x = new int[12];

    int[] y;
    y = new int[12];

    String[] z = new String[100];

    //7.4 displaying an Array
    public void InitArray() {
        int[] array = new int[10];

        System.out.printf("%s%8%n", "Index", "Value");

        for (int counter = 0; i < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
        
    }
    //displaying an array with an array initializer
    public void InitArray() {
        int[] array = {32, 26, 43, 98, 14, 2, 34, 87, 34, 27, 61};

        System.out.printf("%s%8%n", "Index", "Value");

        for (int counter = 0; i < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
        
    }
    // array with length initilization
    public void InitArray() {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;

        System.out.printf("%s%8%n", "Index", "Value");

        for (int counter = 0; i < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
    // summing an array
    public void SumArray(){
        int[] array = {4, 6, 2, 8, 9, 1, 3, 10};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++){
            total += array[counter];
        }

        System.out.println("Total of array elements: " + total);
    }

    // using an array to simulate rolling dice
    public void DieRoll() {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7];

        for (int roll = 1; roll <= 60000000; roll++){
            ++frequency[1 + randomNumbers.nextInt(6)];
        }

        System.out.printf("%s%10%n", "Face", "Frequency");

        for (int face = 1; face < frequency.length; face++){
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }

    // Enhanced for statement example
    public void EnhancedForTest() {
        int[] array = {5, 2, 6, 3, 1, 9, 8};
        int total;

        for (int number : array)
            total += number;

        System.out.println("The total sum is: " + total);
    }
    
    /*
    7.11 Multidimensional Arrays
    -Multi dimensional arrays can be used to represent tables of data, representing rows and columns
    -An array with m rows and n columns is called an m by n array
    */

    // 2D array example
    int[][] b = {{1, 2}, {3, 4}};

    //or 
    int[][] b = {{1, 2}, 
                 {3, 4}};

    // traversal
    public static void outputArray(int[][] array){
        // loop through array's rows
        for (int row = 0; row < array.length; row++)
        {
            // loop through columns of current row
            for (int column = 0; column < array[row].length; column++)
                System.out.printf("%d ", array[row][column]);
            System.out.println();
        }
    }

    /*
    7.15 Class Arrays
    -Useful methods from Array class
    */

    Arrays.sort() // sorts the array in ascending order
    Arrays.binarySearch() // searches for an element in a sorted array
    Arrays.equals() // checks if two arrays are equal
    Arrays.fill() // places values into an array


    /*******************************************************************************************************************************
     * ARRAY LISTS
     * 
     * 
     * * */

    // the main advantage of an arraylist is that it can store and retrieve data without requiring knowlege of how the data is being stored
    // It is part of Java's "collections library"
    // Can only be used with non primitive types
    
    /**Useful Functions */
    add // add element to arraylist
    clear // remove all elements from arraylist
    contains // check if an item is in an array
    get // gets the element at an index
    indexOf // gets the first occurance of an element in the list
    remove // removes first occurance of an item
    size // returns the number of elements in the array list
    trimToSize // trims the capacity of the arraylist to the current number of elements


    /**************************************************************
     * 16.6 LISTS
     */
    /*

    -A list (sometimes called a sequence) is an ordered collection that can contain duplicate elements. Lists are also zero based like arrays.
    -List is implemented by several classes, including ArrayList, LinkedList, and Vector
    -ArrayList and Vector are resizable 
    -ArrayList and Vector are generally inefficient when it comes to inserting elements between existing elements, since all of the elements
     have to be shifted. 
    -LinkedList can do this efficiently, but it is not as good at jumping to specific elememnts in the collection
    -ArrayList and Vector are pretty much identical except vectors are synchronized by default
    -Synchronized means that the vector can only be accessed by one thread at a time
    -Unsynchronized collections provide better performance, therefore ArrayList is usually the better choice in programs that dont share
     a collection among threads


    */

    public static void main(String[] args){
        //Test code here
    }

    



}