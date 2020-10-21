package Problem2019Q_SwapFree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapFree
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] arr = new String[n];
        ArrayList<Integer> swapFreeSets = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            arr[i] = input.next();
        }
        //  <@  Compare each word to all subsequent words
        for(int i = 0; i < n; i++)
        {
            //  <@  Get all subsequent words
            for(int j = i; j < n; j++)
            {
                //  <@  Compare letters to find if more than one difference
                int letters = 0;
                for(int k = 0; k < arr[i].length(); k++)
                {
                    if(arr[i].charAt(k) != arr[j].charAt(k))
                    {
                        letters++;
                    }
                }
                if(letters > 2)
                {
                    swapFreeSets.set(i, swapFreeSets.get(i));
                }
            }
        }
        Collections.sort(swapFreeSets);
    }
}
