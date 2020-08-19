import java.util.Scanner;

public class NumToRomConverter {
	public static void main(String args[]) {
		System.out.println("Welcome to the Numeric to Roman Numeral Converter"
				+ "\nEnter a blank line to quit at any time");
		System.out.println("Please enter an integer");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		while (input != null && !input.contentEquals("")) {
			System.out.println(input + " -> " + "II");
			System.out.println("Please enter an integer");
			input = scanner.nextLine();
		}
		System.out.println("Exiting... Goodbye");
		
	}
	
	private String numericToRoman(int input) {
		
		return "";
	}
}
