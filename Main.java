package task_4;
/**
 * Assignment task 4: Array and List
 * Author: Aadil Imran, 2022
 */
import static java.lang.System.*;
import java.util.*;

public class Main {
	static Scanner input = new Scanner(in);
	public static void main(String[] args) {
		out.print("Enter first line of colours: "); //prompting user input. 
		String l1 = input.nextLine();
		String[] colours1 = l1.split(","); //splitting string of colours into individual colour names and storing in array.
		out.print("Enter second line of colours: ");
		String l2 = input.nextLine();
		String[] colours2 = l2.split(",");
		int sl1 = colours1.length;
		int sl2 = colours2.length;
		List<String> coloverlap = new LinkedList<>();
		
		for (String e1 : colours1) { //iterating through list of colours with for-each loop
			for (String e2 : colours2) {
				if (e1.equalsIgnoreCase(e2)) {
					coloverlap.add(e1);
				}
			}
		}
		out.printf("\nYou entered %d colours in the first line\n", sl1);
		out.printf("You entered %d colours in the second line\n", sl2);
		out.printf("Number of overlaping colours: %d\n", coloverlap.size());
		out.println("Overlaping colours are as follows:");
		for (int i = 0; i < coloverlap.size(); i++) {
			out.println(coloverlap.get(i));
		}
	}
}
