
public class EnhancedForSample2 {

	public static void main(String[] args) {
		int[] scores= {47,55,88,100,74};
		int sum = 0;
		double avarage = 0.0;

		for(int data : scores) {
			sum = sum + data;
		}

		avarage = (double)sum / scores.length;

		System.out.println("合計点は" + sum +"点、平均点は"+avarage+"点です");
	}

}
