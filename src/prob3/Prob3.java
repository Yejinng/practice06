package prob3;

public class Prob3 {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발 될 수 있습니다.";

		/* 코드를 작성합니다 */
		boolean b = false;
		if(str.indexOf("자바")>-1 ){
			System.out.print("[실행결과]\n자바 문자열이 포함되어 있습니다.\n->");
			String str1 = str.replace("자바", "Java");
			System.out.println(str1);
		}

	}
}
