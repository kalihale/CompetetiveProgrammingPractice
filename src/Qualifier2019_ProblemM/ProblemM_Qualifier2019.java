package Qualifier2019_ProblemM;

import java.util.Scanner;

/**
 * Qualifiers 2019, Problem M
 * Authors: Kali Hale, Andres Coppa, Daniel Campbell, Nick Sarullo, Colin Faber
 */

public class ProblemM_Qualifier2019
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        for(int i = 0; i < lines; i++)
        {
            System.out.println();
            int w = input.nextInt();
            int g = input.nextInt();
            int h = input.nextInt();
            int r = input.nextInt();

            int G = g - r;
            int H = h - r;
            int y = (G*w)/(H + G);
            int smallH = Math.abs(h - g);

            double minLength = Math.sqrt((w*w) + (smallH*smallH));
            double maxLength = Math.sqrt((G*G) + (y*y)) + Math.sqrt((H*H) + ((w-y)*(w-y)));
            System.out.println(minLength + " " + maxLength);
        }
    }
}
