
public class Ex603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] mygrades = new double[] {
				89.1, 95.0, 87.7, 88.3, 100.0
		};
		double sum = 0.0;
		double avg = 0.0;
		
		
		double[][] myclassgrades = new double[] [] {
				{89.1, 88.2, 83.2, 85.5, 75.2},
				{95.0, 93.2, 91.1, 89.9, 75.5}, 
				{87.7, 65.2, 54.2, 32.1, 10.0}, 
				{88.3, 66.6, 77.7, 88.8, 99.9}, 
				{100.0, 99.9, 98.0, 97.6, 100.0}
		};
		String[] myclasses = new String[] {
				"국어", "수학", "공학", "사회", "체육"
		};
		
		for (int i =0; i< myclasses.length; i++) {
			System.out.print(myclasses[i] + ": ");
			for (int j = 0; j < 5; j++) {
				System.out.print(myclassgrades[i][j]+ ",");
			}
			System.out.println();
		}
		/*
		for (double g : mygrades) {
			sum += g;
		}
		
		avg = sum / mygrades.length;
		
		System.out.println("합계: " + sum);
		System.out.format("평균: %.2f ", avg);

	}*/

}
}
