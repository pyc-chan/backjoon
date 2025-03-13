// 전체 상금이 주어졌을때
// 제세공과금 22%를 제외한 상금과
// 상금의 80%를 필요 경비로 인정하여
// 나머지 20%중 22%만을 제세공과금으로 납부할 때 상금

int prize = int.Parse(Console.ReadLine());
int aftertex1 = prize - (prize/100*22);
int aftertex2 = prize - (prize/5/100*22);

Console.WriteLine($"{aftertex1} {aftertex2}");