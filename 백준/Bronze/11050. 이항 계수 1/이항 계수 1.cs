String str = Console.ReadLine();

int[] nums = str.Split(' ').Select(x => int.Parse(x)).ToArray();
int a = nums[0] - nums[1];
int result = 1;

for(int i = 1; i <= nums[0]; i++)
{
    result *= i;
}

for (int i = 1; i <= nums[1]; i++)
{
    result /= i;
}

for(int i = 1; i <= a; i++)
{
    result /= i;
}
Console.WriteLine(result);