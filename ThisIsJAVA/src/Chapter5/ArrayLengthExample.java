package Chapter5;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 98 };
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("����: " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("���"+ avg);

	}

}
