package stringOutput;
import java.util.Scanner;
public class StringOutput {
	
	static void printCapitalized(String str) {
		char ch;
		int i;
		char prevCh = '.';
		
		
		
		for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isLetter(ch) && !Character.isLetter(prevCh)) {
				System.out.print(Character.toUpperCase(ch));
			}
			else {
				System.out.print(ch);
			}
			prevCh = ch;
		}
	}
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner (System.in);
		
		
		
			System.out.println("This Capitalizes The First Letter\nOf An Input");
			System.out.println("Input your sentence:\n");
			str = scan.nextLine();
			printCapitalized(str);
			
		
		
		
		
		
	}

}