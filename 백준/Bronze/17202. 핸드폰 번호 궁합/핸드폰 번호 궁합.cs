string num1 = Console.ReadLine();
string num2 = Console.ReadLine();
int[] result = new int[16];
for(int i = 0; i < 16; i++)
{
    if(i % 2 == 0)
    {
        result[i] = num1[i/2]-48;
    }
    else
    {
        result[i] = num2[i/2]-48;
    }
}
for(int i = 0; i < 14; i++)
{
    for(int j = 0; j< 15 - i; j++)
    {
        result[j] = (result[j] + result[j + 1]) % 10;
    }
}
Console.WriteLine(result[0] + "" + result[1]);