string input;
        while ((input = Console.ReadLine()) != null)
        {
            int[] numbers = input.Split(' ').Select(int.Parse).ToArray();
            int n = numbers[0];
            int k = numbers[1];

            int totalChicken = 0;
            int coupons = n;

            while (coupons >= k)
            {
                int newChicken = coupons / k;
                totalChicken += newChicken;
                coupons = newChicken + (coupons % k);
            }

            totalChicken += n;
            Console.WriteLine(totalChicken);
        }