import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/*  
 * Authors: Kali Hale, Andres Coppa, Nick Sarullo, Collin Faber
 *  October 13, 2020 (10/13/2020)
 */

public class ProblemD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> badNums = new ArrayList<Integer>();
		int firstNum = 0;
		firstNum = scan.nextInt();
		int count = 0;
		do {
			//System.out.println("here");
			badNums.add(scan.nextInt());
			count++;
		} while (scan.hasNextInt());
		
		ArrayList<Integer> goodNums = new ArrayList<Integer>();
		for(int i = 1; i <= badNums.get(badNums.size()-1); i++) {
			goodNums.add(i);
			//System.out.println(i);
		}
		
		goodNums.removeAll(badNums);
		//CollectionUtils.subtract(goodNums,badNums);
		System.out.println(Arrays.toString(goodNums.toArray()));
	}
	

}

