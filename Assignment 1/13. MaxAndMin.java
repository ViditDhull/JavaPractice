import java.util.Scanner;

public class MaxAndMin {
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
		
		double max = arr[0];
		for(int j = 0; j<num;j++) {
			if(arr[j]>max) {
				max = arr[j];
			}
		}
		System.out.println("The maximum of array is : " + max);
		
		double min = arr[0];
		for(int j = 0; j< num; j++) {
			if(arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println("The minimum of array is : " + min);
		s.close();
	}
}


