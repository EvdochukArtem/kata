using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Roman_Numerals_Encoder
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(RomanConvert.Solution(1954));
            Console.ReadLine();
        }
    }
    public class RomanConvert
    {
        public static string Solution(int n)
        {
            string result = "", digit, roman = "IVXLCDM";
            int j = 0, a;
            while (n > 0)
            {
                a = 0; digit = "";
                while (n % 10 - a > 0)
                {
                    digit += roman[j * 2];
                    a++;
                }
                if (a % 5 == 4)
                    digit = digit.Remove(1) + roman[j * 2 + a / 4];
                else if (a / 5 > 0)
                    digit = digit.Remove(a % 5)
                                 .Insert(0, roman[j * 2 + a / 5].ToString());
                result = result.Insert(0, digit);
                n /= 10; j++;
            }
            return result;
        }
    }
}
