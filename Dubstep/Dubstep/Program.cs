using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dubstep
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(SongDecoder("RWUBWUBWUBLWUBWUB"));
            Console.ReadLine();
        }
        public static string SongDecoder(string input)
        {
            /*input = input.Replace("WUB", "!");
            for (int i = 0; i < input.Length; i++)
            {
                int a = input.IndexOf("!!");
                input = input.Remove(input.IndexOf("!!"), 1);
            }*/
            return input.Replace("WUB", "!").Replace("!!", "!").Trim('!');
        }
    }
}
