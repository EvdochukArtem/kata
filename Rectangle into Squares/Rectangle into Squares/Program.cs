using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Rectangle_into_Squares
{
    class Program
    {
        static void Main(string[] args)
        {
            SqInRect.sqInRect(20, 14);
            SqInRect.sqInRect(5, 5);
            Console.ReadLine();
        }
    }

    public class SqInRect
    {

        public static List<int> sqInRect(int lng, int wdth)
        {
            List<int> sqrs = new List<int>() {};
            if (lng != wdth)
            {
                int rsqt = lng * wdth;
                int sqr = 0;
                int a = Math.Min(lng, wdth);
                while (a * a > rsqt) a--;
                while (sqr < rsqt)
                {
                    if (sqr + a * a > rsqt) a--;
                    else
                    {
                        sqr += a * a;
                        sqrs.Add(a);
                        if (sqr == rsqt)
                        {
                            foreach (int Sq in sqrs)
                            {
                                Console.Write(Sq);
                            }
                            Console.WriteLine();
                            return sqrs;
                        }
                    }
                }
            }
            return null;
        }
    }

}
