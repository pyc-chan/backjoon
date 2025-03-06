int start = int.Parse(Console.ReadLine());
int end = int.Parse(Console.ReadLine());

for(int i = start; i <= end; i = i+60)
{
    Console.WriteLine($"All positions change in year {i}");
}