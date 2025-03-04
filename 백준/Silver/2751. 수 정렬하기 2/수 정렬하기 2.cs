using System.Text;

int num = int.Parse(Console.ReadLine());
int[] arr = new int[num];
for (int i = 1; i <= num; i++)
{
    arr[i - 1] = int.Parse(Console.ReadLine());
}
Array.Sort(arr);
StringBuilder sb = new StringBuilder();
for(int i = 0; i < num; i++)
{
    sb.Append(arr[i] + "\n");
}
Console.WriteLine(sb.ToString());