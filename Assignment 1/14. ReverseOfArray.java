import java.util.Scanner;
import java.util.Arrays;

public class ReverseOfArray {
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
		double[] tempArr = new double[num];
		for (int i = 0;i<num;i++) {
			int j = num - (i+1);
			tempArr[j] = arr[i];
		}
		System.out.println(Arrays.toString(tempArr));
		s.close();
	}

}
