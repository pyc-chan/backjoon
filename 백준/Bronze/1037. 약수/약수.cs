int num = int.Parse(Console.ReadLine());
string[] strs = Console.ReadLine().Split();
int max = 1;
int min = 1000000;
if (strs.Length > 1)
{
    for (int i = 0; i < strs.Length; i++)
    {
        int Val = int.Parse(strs[i]);
        if(Val > max) max = Val;
        if(Val < min) min = Val;
    }
}
else
{
    max = int.Parse(strs[0]);
    min = int.Parse(strs[0]);
}
int result = max * min;
Console.WriteLine(result);
