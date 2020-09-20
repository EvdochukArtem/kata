import java.util.Arrays;

public class WeightSort {

    public static void main(String[] args) {
        assertEquals("2000 103 123 4444 99", WeightSort.orderWeight("103 123 4444 99 2000"));
        assertEquals ("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort.orderWeight   ("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
    
    static void assertEquals(final String example, final String result) {
        boolean res = example.equals(result);
        System.out.println(res);
        if (!res)
        {
            System.out.println(example);
            System.out.println(result);
        }
    }

	public static String orderWeight(String strng) {

        return String.join(" ", Arrays.stream(strng.split(" "))
        .sorted((s1, s2) -> {
            return weightCompare(s1, s2);
        })
        .toArray(String[]::new));
    }

    private static int weightCompare(String s1, String s2) {

        int i1 = s1.chars().map(c -> Character.getNumericValue(c)).sum();
        int i2 = s2.chars().map(c -> Character.getNumericValue(c)).sum();
        if (i1 == i2) 
            return s1.compareTo(s2);
        else
            return i1 - i2;
    }
}