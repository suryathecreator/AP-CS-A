public class Array2DExercises 
{
    /**
     * @param arr a 2D array of ints
     * @return the maximum value in the 2D parameter array 
     */ 
    public static int max(int[][] arr) 
    {
        int maximumValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] > maximumValue)
                {
                    maximumValue = arr[i][j];
                }

            }
        }
        return maximumValue;  
    }

    /**
     * @return the sum of the elements in row r of arr.
     * @param arr a 2D array of ints
     * @param r the row index
     */  
    public static int rowSum(int[][] arr, int r)
    {
        int rowSum = 0;
        for (int i = 0; i < arr[r].length; i++)
        { 
            rowSum += arr[r][i];
        }
        return rowSum;
    }
        
    
    

    /**
     *  @return the sum of the elements in column c of arr (careful with rows of different lengths!)
     *  @param arr a 2D array of ints
     *  @param c the column index
     */ 
    public static int columnSum(int[][] arr, int c)
    {
        int colSum = 0;
        for (int i = 0; i < arr.length; i++)
        { 
            if (c < arr[i].length)
            {
                colSum += arr[i][c];
            }
        }
        return colSum;
    }

    /**
     * @return an array of the row sums. Note: index i of the return array contains the sum
     * of elements in row i.
     * @param arr a 2D array of ints
     */ 
    public static int[] allRowSums(int[][] arr)
    {
        int[] rowSums;
        rowSums = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                    rowSums[i] += arr[i][j];
            }
        }
        return rowSums;    
    }
        
    /**
     *     checks if an array is row-magic (this means that every row has the same row sum).
     *     @return true if arr is row-magic; false otherwise
     *     @param arr a 2D array of ints
     */
    public static boolean isRowMagic(int[][] arr)
    {
        int[] rowSums = allRowSums(arr);
        for (int i = 0; i < rowSums.length; i++)
        {
            for (int j = 0; j < rowSums.length; j++)
            {
                if (rowSums[i] != rowSums[j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * checks if a rectangular array is column-magic (this means that every column has the same column sum).
     * pre-condition: arr is rectangular 2-D array
     * @return true if arr is column-magic; false otherwise
     * @param arr a rectangular 2D array of ints
     * 
     */
    public static boolean isColumnMagic(int[][] arr)
    {
        int[] colSums;
        colSums = new int[arr[0].length];
        for (int i = 0; i < arr[0].length; i++)
        {
            colSums[i] = columnSum(arr, i);
        }
        for (int i = 0; i < colSums.length; i++)
        {
            for (int j = 0; j < colSums.length; j++)
            {
                if (colSums[i] != colSums[j])
                {
                    return false;
                }
            }
        }
        return true;    
    }
    
    /**
     * checks if the array is square (i.e. every row has the same length as a itself).
     * @param arr a 2D array of ints
     * @return true if arr is square; false otherwise
     */
    public static boolean isSquare(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr.length != arr[i].length)
            {
                return false;
            }
        }
        return true;   
    }

    /**
     * Checks if the array is a magic square. This means that it must be square, 
     * and that all row sums, all column sums, and the two diagonal-sums must all be equal.
     * @param arr a 2D array of ints
     * @return true if arr is a magic square; false otherwise
     */
    public static boolean isMagic(int[][] arr)
    {
        if (!isSquare(arr))
        {
            return false;
        }
        boolean isDiagonal;
        int diagOne = 0, diagTwo = 0;

        for (int i = 0; i < arr.length; i++)
        {
            diagOne += arr[i][i];
        }
        for (int i = arr.length - 1; i >= 0; i--)
        {
            diagTwo += arr[i][i];
        }

        if (diagOne == diagTwo)
        {
            isDiagonal = true;
        }
        else
        {
            isDiagonal = false;
        }
        if (isRowMagic(arr) && isColumnMagic(arr) && isDiagonal)
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }


 
}