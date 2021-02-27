//factorial of entered number (cycle "for")
using System;

namespace Prime
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Enter integer number: ");
            int n = Convert.ToInt32(Console.ReadLine());

            int f = 1;

            for (int i = 1; i <= n; i++)
            {
                f = f * i;
            }
            Console.WriteLine(f);

            Console.ReadKey();
        }
    }
}