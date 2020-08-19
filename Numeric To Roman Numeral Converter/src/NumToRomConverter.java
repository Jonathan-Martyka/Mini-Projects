import java.util.Scanner;

public class NumToRomConverter {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.println("Welcome to the Numeric to Roman Numeral Converter"
				+ "\nEnter a blank line to quit at any time");
		
		System.out.println("Please enter an integer");
		input = scanner.nextLine();
		
		while (input != null && !input.contentEquals("")) {
			System.out.println(input + " -> " + numericToRoman(input));
			System.out.println("Please enter an integer");
			input = scanner.nextLine();
		}
		
		System.out.println("Exiting... Goodbye");
		scanner.close();
		
	}
	
	private static String numericToRoman(String number) {
		String result = "";
		
		//anything higher than thousands (3999) impossible by standardized methods
		switch (number.length()) {
		case 4: result += thousandsToRoman(number.charAt(0));
		case 3: result += hundredsToRoman(number.charAt(1));
		case 2: result += tensToRoman(number.charAt(2));
		case 1: result += onesToRoman(number.charAt(3));
		}
		
		return result;
	}
	
	private static String onesToRoman(char numChar) {
		switch (numChar) {
		case '0': return "";
		case '1': return "I";
		case '2': return "II";
		case '3': return "III";
		case '4': return "IV";
		case '5': return "V";
		case '6': return "VI";
		case '7': return "VII";
		case '8': return "VIII";
		case '9': return "IX";
		default: return "";
		}
	}
	
	private static String tensToRoman(char numChar) {
		switch (numChar) {
		case '0': return "";
		case '1': return "X";
		case '2': return "XX";
		case '3': return "XXX";
		case '4': return "XL";
		case '5': return "L";
		case '6': return "LX";
		case '7': return "LXX";
		case '8': return "LXXX";
		case '9': return "XC";
		default: return "";
		}
	}
	
	private static String hundredsToRoman(char numChar) {
		switch (numChar) {
		case '0': return "";
		case '1': return "C";
		case '2': return "CC";
		case '3': return "CCC";
		case '4': return "CD";
		case '5': return "D";
		case '6': return "DC";
		case '7': return "DCC";
		case '8': return "DCCC";
		case '9': return "CM";
		default: return "";
		}
	}
	private static String thousandsToRoman(char numChar) {
		//Note: Roman numerals cap at 3999
		switch (numChar) {
		case '0': return "";
		case '1': return "M";
		case '2': return "MM";
		case '3': return "MMM";
		default: return "";
		}
	}
}
