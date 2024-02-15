public class Assignment04
{
    public static void main(String[] args)
    {
        int[] arrNumbers = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        distinct(arrNumbers);
        int[] arrNumbers_test2 = {1, 2, 2, 2, 5, 7, 1, 3, 4, 4};    
        distinct(arrNumbers_test2);
        int[] arrNumbers_test3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        distinct(arrNumbers_test3);

        //exercise 1 tester above


        double[] arrNumbersExercise2 = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};
        standardDeviation(arrNumbersExercise2);

        double[] arrNumbersExercise2_test2 = {65.5, 67.7, 81.0, 26.3, 62.2, 36.0, 26.7, 26.2, 63.2, 71.7};
        standardDeviation(arrNumbersExercise2_test2);

        double[] arrNumbersExercise2_test3 = {83.9, 93.4, 54.2, 46.6, 81.3, 30.2, 8.0, 28.9, 50.9, 29.4};
        standardDeviation(arrNumbersExercise2_test3);

        //exercise 2 tester above

        int[][] testMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        largestSumColumns(testMatrix);

        int[][] testMatrix_test2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        largestSumColumns(testMatrix_test2);

        int[][] testMatrix_test3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}
        };
        largestSumColumns(testMatrix_test3);
        //exercise 3 tester above



    }

    public static void distinct(int[] arrNumbers)
    {
        /*
        psuedocode:
        1. read the arry in
        2. use isDistinct variable to check if it is distinct
        3. use the if statement and a count variable to store and display the distinct variable
        */
        int[] distinctArray = new int[10];
        int distinctCount = 0;

        for (int i = 0; i < arrNumbers.length; i++)
        {
            boolean isDistinct = true;
            for (int j = 0; j < distinctCount; j++)
            {
                if (arrNumbers[i] == distinctArray[j])
                {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct == true)
            {
                distinctArray[distinctCount] = arrNumbers[i];
                distinctCount++;
            }
        }

        System.out.println("The number of distinct number is " + distinctCount);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctCount; i++)
        {
            System.out.print(distinctArray[i] + " "  );
            if (i == distinctCount - 1)
            {
                System.out.println("\n");
            }

        }
    }

    public static double[] deviation(double[] arrNumbers)
    {
        /* pseudocode:
        1. Use the mean method to calculate the mean
        2. new a array which is same size as the original array
        3. calculate each deviations and stored in the new array by using the for loop.

         */
        double mean = mean(arrNumbers);
        double[] deviations = new double[arrNumbers.length];

        for (int i = 0; i < arrNumbers.length; i++) 
        {
            deviations[i] = arrNumbers[i] - mean;
        }

        return deviations;


    }
    public static double mean(double[] arrNumbers)
    {
        /*
        pseudo-code:
        1. create new variable to store the sum and mean
        2. add each elements in the array to the sum and get the final value of sum
        3. calculate sum by using sum / length
         */
        double sum = 0;
        double mean = 0;
        for (int i = 0; i < arrNumbers.length; i++)
        {
            sum = sum + arrNumbers[i];
        }
        mean = sum / arrNumbers.length;
        return mean;

    }

    public static double standardDeviation(double[] arrNumbers)
    {
        /*
        pseudocode:
        1. create a new array to store the deviation arrays
        2. create a variable to store teh sum of squares
        3. use the enhanced for loop to calculate the sum of squares by deviation ^2
        4. calculate the variance
         */
        double deviations[] = deviation(arrNumbers);
        double sumOfSquares = 0;
        for (double deviation : deviations)
        {
            sumOfSquares += deviation * deviation;
        }
        double variance = sumOfSquares / (arrNumbers.length - 1);
        System.out.println("The mean is: " + mean(arrNumbers));
        System.out.println("\nThe standard deviation is : " + Math.sqrt(variance) + "\n");
        return Math.sqrt(variance);
    }

    public static int[] largestSumColumns(int[][] matrix)
    {
        /*
         * Pseudocode:
         * 1. Create variable to store the index of the largest column, sum of the largest column, andthe largest column
         * 2. Use the for loop to calculate the sum of each column, if the sum is larger than the largest column, update the largest column and the sum
         * 3. Create a new array to store the largest column
         * 4. Use the for loop to store the largest column into the new array
         * 5. Print the new array
         */
        int maxColumnIndex = 0;
        int sum = 0;
        int largestColumns = -2147483648;
        for (int col = 0; col < matrix[0].length; col++)
        {
            for (int row = 0; row < matrix.length; row++)
            {
                sum += matrix[row][col];
            }

            if (sum > largestColumns)
            {
                largestColumns = sum;
                maxColumnIndex = col;
                sum = 0;
            }

        }
        int[] resultColumn = new int[matrix.length];
        for (int row = 0; row < matrix.length; row++)
        {
            resultColumn[row] = matrix[row][maxColumnIndex];
        }
        System.out.println("resultColumn: ");
        printArray(resultColumn);
        return resultColumn;
    }

    public static void printArray(int[] array)
    {
        /*
        Pseudocode:
        1. This method is for printing array.
        2. It uses simple for loop to traverse every single element in the array and print it ony by one
         */
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
    }

}
