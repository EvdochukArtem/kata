public class Encoder {
    
    public static void main(final String[] args) {
        assertEquals("!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1));
        assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO",
                PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
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

    static class PlayPass {
        public static String playPass(final String s, final int n) {

            String output = "";

            for (int i = 0; i < s.length(); i++)
                if (Character.isLetter(s.charAt(i)))
                    if (i % 2 == 1)
                        output += Character.toLowerCase(ShiftLetter(s.charAt(i), n));
                    else
                        output += ShiftLetter(s.charAt(i), n);
                else if (Character.isDigit(s.charAt(i))) {
                    output += 9 - Character.getNumericValue(s.charAt(i));
                } else
                    output += s.charAt(i);

            return new StringBuilder(output).reverse().toString();
        }

        private static char ShiftLetter(final char c, final int n)
        {
            if (c + n > (int)'Z')
                return (char)((int)'A' + (c + n - (int)'Z') - 1);
            else
                return (char)(c + n);
        }
    }
}