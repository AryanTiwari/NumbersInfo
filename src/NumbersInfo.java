import java.util.Scanner;
import java.text.DecimalFormat;

public class NumbersInfo {

	static DecimalFormat df = new DecimalFormat("###,##0.###");
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Which numbers to average and range?");

		String numbersString = input.nextLine();
		String[] numberStringArray = numbersString.trim().split("\\s+");
		Double[] numbers = new Double[numberStringArray.length];
		for (int i = 0; i < numberStringArray.length; i++) {
			numbers[i] = Double.parseDouble(numberStringArray[i]);
		}

		Double max = numbers[0];
		Double min = numbers[0];
		int count = numbers.length;
		Double total = 0.0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			}

			if (numbers[i] < min) {
				min = numbers[i];
			}
			total = total + numbers[i];

		}

		Double range = max - min;
		Double average = total / count;
		System.out.println("Average: " + df.format(average));
		System.out.println("Range: " + df.format(range));
		System.out.println("Max: " + df.format(max));
		System.out.println("Min: " + df.format(min));
	}

}