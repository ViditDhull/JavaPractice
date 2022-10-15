import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements of array : ");
		int num = s.nextInt();
		double[] arr = new double[num];
		for (int i = 0; i<num; i++) {
			System.out.println("Enter the " + (i+1) + " number : ");
			double input = s.nextDouble();
			arr[i] = input;
		}
		
		double sum = 0;
		for(double j : arr) {
			sum = sum + j;
		}
		System.out.println("The sum of the array is " + sum);
		s.close();
	}

}
