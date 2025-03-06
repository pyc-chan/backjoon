while (true)
{
    string input = Console.ReadLine();
    string output = "";
    if (input == "***")
    {
        break;
    }
    for(int i = input.Length-1; i >= 0; i--)
    {
        output += input.ToCharArray()[i];
    }
    Console.WriteLine(output);
}