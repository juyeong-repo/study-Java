package Chapter5;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 23, 44 };
		int sum = 0;
		for (int score : scores) { // ��������, �迭
			sum = sum + score;
		}
		System.out.println("��������: " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("�������= "+avg);

	}
}
