// 라벨지에 "WelcomeToSMUPC" 라는 문구가
// 공백없이 반복적으로 적혀 있을때
// N번째 글자를 출력하는 프로그램을 작성하시오.

string label = "WelcomeToSMUPC";
int N = int.Parse(Console.ReadLine());
Console.WriteLine(label[(N - 1)%14]);