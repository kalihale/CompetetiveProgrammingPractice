package Problem3_KaliHale_AndresCoppa_NickSarullo_CollinFaber;

import java.util.Scanner;

/*  
 * Authors: Kali Hale, Andres Coppa, Nick Sarullo, Collin Faber
 *  September 21, 2020 (9/21/2020)
 */

public class Problem3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		do {
			num = scan.nextInt();
			System.out.println();
			System.out.println(num + ":");
			for (int i = 2; i <= (int) (Math.ceil((double) num * .5)); i++) {
				if ((num - i) % (i + (i - 1)) == 0 || (num % (i + (i - 1)) == 0)) {
					System.out.println(" " + i + "," + (i - 1));
				}

				if (num % i == 0) {
					System.out.println(" " + i + "," + i);
				}
			}
		} while (scan.hasNext());
	}

}

