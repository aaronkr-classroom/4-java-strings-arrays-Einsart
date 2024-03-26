
public class Ex602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mynums = new int [10];
		
		// 배열 채우기
		for(int i = 0; i < mynums.length; i++) {
			mynums[i] = i * i;
		}
		
		//배열 출력
		for(int i = 0; i < mynums.length; i++) {
			System.out.println(i+ ": " + mynums[i]);

	}

}
}