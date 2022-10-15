import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements of array : ");
		int num = s.nextInt();
		double[] arr = new double[num];
		for (int i = 0; i<num; i++) {
			System.out.println("Enter the number " + (i+1));
			double input = s.nextDouble();
			arr[i] = input;
		}
		Arrays.sort(arr);
		System.out.println("The second largest element is " + arr[num-2]);
		s.close();
	}

}
