string str = Console.ReadLine();
string[] strs = str.Split();
int num1 = int.Parse(strs[0]);
int num2 = int.Parse(strs[1]);
double result = num1 * 1.0 / num2;
Console.WriteLine(result);