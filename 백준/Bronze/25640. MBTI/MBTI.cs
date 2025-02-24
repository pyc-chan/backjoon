string mbti = Console.ReadLine();
int num = int.Parse(Console.ReadLine());
int result = 0;
for (int i = 0; i < num; i++)
{
    string str = Console.ReadLine();
    if(str == mbti)
    {
        result++;
    }
}
Console.WriteLine(result);
