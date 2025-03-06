int[] wookjea = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
double m = (wookjea[1] - wookjea[0])/400.0;

double result = 1 / (1 + Math.Pow(10, m));
Console.WriteLine(result);