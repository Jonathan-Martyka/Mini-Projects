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
	
	private String numericToRoman(int number) {
		
		return "";
	}
	
	private String onesToRoman(int number) {
		switch (number) {
		case 1: return "I";
		case 2: return "II";
		case 3: return "III";
		case 4: return "IV";
		case 5: return "V";
		case 6: return "VI";
		case 7: return "VII";
		case 8: return "VIII";
		case 9: return "IX";
		default: return "";
		}
	}
	
	private String tensToRoman(int number) {
		switch (number) {
		case 1: return "X";
		case 2: return "XX";
		case 3: return "XXX";
		case 4: return "XL";
		case 5: return "L";
		case 6: return "LX";
		case 7: return "LXX";
		case 8: return "LXXX";
		case 9: return "LC";
		default: return "";
		}
	}
	
	private String hundredsToRoman(int number) {
		switch (number) {
		case 1: return "C";
		case 2: return "CC";
		case 3: return "CCC";
		case 4: return "CD";
		case 5: return "D";
		case 6: return "DC";
		case 7: return "DCC";
		case 8: return "DCCC";
		case 9: return "CM";
		default: return "";
		}
	}
	private String thousandsToRoman(int number) {
		//Note: Roman numerals cap at 3999
		switch (number) {
		case 1: return "M";
		case 2: return "MM";
		case 3: return "MMM";
		default: return "";
		}
	}
}
