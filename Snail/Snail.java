public class Snail {
    
    public static void main(String[] args) {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        assertEquals(r, Snail(array));        
    }
    
    public static int[] Snail(int[][] array)
    {
      int rI = 0;
      int index = 0;
      int max = array.length - 1;
      int [] result = new int [array.length * array.length];
      while (index <= max) {
       
        for (int i = index; i <= max; i++)
          result[rI++] += array[index][i];
        for (int i = index + 1; i <= max; i++)
          result[rI++] += array[i][max];
        for (int i = max - 1; i >= index; i--)
          result[rI++] += array[max][i];
        for (int i = max - 1; i >= index + 1; i--)
          result[rI++] += array[i][index];
        index++;
        max--;
      }
      return result;
    }

    static void assertEquals(final int[] expected, final int[] result) {
        boolean res = expected.equals(result);
        System.out.println(res);
        if (!res)
        {
            System.out.println(expected.toString());
            System.out.println(result.toString());
        }
    }
}
