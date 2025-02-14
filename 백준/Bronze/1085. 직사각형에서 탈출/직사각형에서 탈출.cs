string[] strs = Console.ReadLine().Split();
int[] nums = new int[strs.Length];
for(int i = 0; i < strs.Length; i++)
{
    nums[i] = int.Parse(strs[i]);
}
int min = nums[0];
if(min > nums[1])
{
    min = nums[1];
}
for(int i = 2;  i < nums.Length; i++)
{
    if(min > nums[i] - nums[i - 2])
    {
        min = nums[i] - nums[i-2];
    }
}
Console.WriteLine(min);