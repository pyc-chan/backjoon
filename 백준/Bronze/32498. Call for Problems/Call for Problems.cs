int num = int.Parse(Console.ReadLine());
int result = 0;
for (int i = 0; i < num; i++)
{
    int input = int.Parse(Console.ReadLine());
    if (input % 2 != 0)
    {
        result++;
    }
}
Console.Write(result);