int num = int.Parse(Console.ReadLine());

for (int i = 0; i < num; i++)
{
    string str = Console.ReadLine();
    foreach (char c in str)
    {
        if(c <= 'Z' && c >= 'A')
        {
            Console.Write((char)(c + 32));
        }
        else
        {
            Console.Write(c);
        }
    }
    Console.WriteLine();
}
