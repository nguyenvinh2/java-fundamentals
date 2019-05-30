# java-fundamentals

1.  [Lab 1: Java Primitives and Control Flow](./basics/)

        Main.java

          public static String pluralize(int numberInput, String stringInput)  
          public static void flipNHeads(int nFLips)  
          public static void clock()  

2.  [Lab 2: Arrays, Loops, Imports, ArrayLists](./basiclibrary)

        Library.java

          public static int[] roll(int rollNumber)  
          public static boolean containsDuplicates(int[] input)  
          public static float calculateAverage(int[] input)  
          public static float lowestAverage(int[][] input)

3.  [Lab 03: Maps](./basiclibrary)

        Library.java
        
           public static String analyzeWeatherData(int[][] weather)
           public static List<String> tally(List<String> input)
            
    [Lab03: File I/O, and Testing](./linter)
    
        App.java
        
           public static List<String> fileLinter(String fileName)
           
            * Takes file path of the File to be read as input.
            * Uses BufferedReader to read each line.
            * Traverses through the file with a while loop using the readLine method.
            * Checks to see if the line ends with a semicolon in
              accordance with requirements:      

                - Don’t show an error if the line is empty.
                - Don’t show an error if the line ends with an opening curly brace {
                - Don’t show an error if the line ends with an closing curly brace }
                - Don’t show an error if the line contains if or else
              
              Adds an error statement to a List if missing semicolon.
              Returns a List of Strings.

            
    