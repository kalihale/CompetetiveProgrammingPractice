import java.util.*;

/**
 * Kali Hale, Andres Coppa, Nick Sarullo, Collin Faber
 */
public class Problem4_2015
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int row = 0;
        int columns = 0;
        int[][] coordinates = new int[2][100];
        int numberOfCoordinates = 0;
        while(input.hasNext())
        {
            String newline = input.nextLine();
            for(int i = 0; i < newline.length(); i++)
            {
                if(newline.charAt(i) == 'x')
                {
                    coordinates[0][numberOfCoordinates] = row;
                    coordinates[1][numberOfCoordinates] = i;
                    numberOfCoordinates++;
                }
            }

            row++;
            // This program requires an input of "-" on a new line to break out of the loop.
            if(newline.charAt(0) == '-')
            {
                break;
            }
        }
        ArrayList<Integer> lengths = new ArrayList<>();
        int numlengths = 0;
        int temp = 0;
        for(int i = 0; i < numberOfCoordinates; i++)
        {
            for(int j = i + 1; j < numberOfCoordinates; j++)
            {
                lengths.add(Math.abs(coordinates[0][i] - coordinates[0][j])
                        + Math.abs(coordinates[1][i] - coordinates[1][j]));
            }
        }
        Set<Integer> s = new HashSet<Integer>(lengths);
        System.out.println(s.size());
    }
}
