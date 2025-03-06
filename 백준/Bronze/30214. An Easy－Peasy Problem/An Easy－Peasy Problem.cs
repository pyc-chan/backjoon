int[] test = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
if (test[0]*2 >= test[1])
{
    Console.WriteLine("E");
}
else
{
    Console.WriteLine("H");
}