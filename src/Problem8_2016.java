import java.util.Scanner;

public class Problem8_2016
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int X = 0;
        int largestPrice = 0;
        int lpIndex = 0;
        int sum = 0;
        int count = 0;
        int[] prices = new int[N];
        for(int i = 0; i < N; i++)
        {
            prices[i] = input.nextInt();
        }
        for(int i = 1; i < N; i++)
        {
            if(K*i <= N - i)
            {
                X = i;
            }
        }
        for(int i = 1; i <= K; i++)
        {
            count = 0;
            largestPrice = 0;
            for(int j = K; j < N; j++)
            {
                if (prices[j] > largestPrice)
                {
                    lpIndex = j;
                    largestPrice = prices[lpIndex];
                    count++;
                }
            }
            if(count >= K)
            {
                prices[lpIndex] = 0;
            }
        }
        for(int i = 0; i < N; i++)
        {
            sum += prices[i];
        }
        System.out.print(sum);

    }
}
