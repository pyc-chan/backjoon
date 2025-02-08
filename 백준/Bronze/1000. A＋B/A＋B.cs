string str = Console.ReadLine();
int[] numbers = str.Split(" ").Select(int.Parse).ToArray();
Console.WriteLine("{0}", numbers[0]+numbers[1]);