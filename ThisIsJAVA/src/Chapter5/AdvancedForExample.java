package Chapter5;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 23, 44 };
		int sum = 0;
		for (int score : scores) { // 변수선언, 배열
			sum = sum + score;
		}
		System.out.println("점수총합: " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("점수평균= "+avg);

	}
}
