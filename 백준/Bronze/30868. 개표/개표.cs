int num = int.Parse(Console.ReadLine());
for (int i = 0; i < num; i++)
{
    int vote = int.Parse(Console.ReadLine());
    for(int j = 0; j < vote/5; j++)
    {
        Console.Write("++++ ");
    }
    for (int j = 0; j < vote % 5; j++)
    {
        Console.Write("|");
    }
    Console.WriteLine();
}
