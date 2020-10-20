package Qualifier2019_2;

import java.util.Scanner;

/**
 * @author Kali Hale, Andres Coppa, Nick Sarullo, Colin Faber, Daniel Campbell
 * 15 October 2020
 */

public class ProblemC_Qualifier2019
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int precincts = input.nextInt();
        int districts = input.nextInt();
        int[][] votes = new int[2][districts];
        int totalVotes = 0;
        for(int i = 0; i < precincts; i++)
        {
            // district
            int district = input.nextInt();
            // party A
            votes[0][district - 1] += input.nextInt();
            // party B
            votes[1][district - 1] += input.nextInt();
        }
        int totalWastedVotesA = 0;
        int totalWastedVotesB = 0;
        for(int i = 0; i < districts; i++)
        {
            int wastedVotesA = 0;
            int wastedVotesB = 0;
            // party A loses
            if(votes[0][i] < votes[1][i])
            {
                wastedVotesA += votes[0][i];
                wastedVotesB += votes[1][i] - (((votes[0][i] + votes[1][i])/2) + 1);
                System.out.println("B " + wastedVotesA + " " + wastedVotesB);
            }
            // party B loses
            else
            {
                wastedVotesA += votes[0][i] - (((votes[0][i] + votes[1][i])/2) + 1);
                wastedVotesB += votes[1][i];
                System.out.println("A " + wastedVotesA + " " + wastedVotesB);
            }
            totalWastedVotesA += wastedVotesA;
            totalWastedVotesB += wastedVotesB;
            totalVotes += votes[0][i] + votes[1][i];
        }
        // efficiency calculation
        System.out.println((Math.abs((double)totalWastedVotesA - (double)totalWastedVotesB) / (double)totalVotes));
    }
}
