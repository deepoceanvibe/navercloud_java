package exception.trycatch;

public class TryCatchExample2 {
	public static void main(String[] args) {
		
		String[] greetings = {"안녕", "Hello", "니하오", "싸왓다"};
		
		int i = 0;
		while(i < 5) {
			try {
				System.out.println(i + ". " + greetings[i]);
			} catch (Exception e) {
				System.err.println(i + ". 배열의 참조 범위를 벗어남");
			} finally {
				System.out.println("~");
			}
			i++;
		}
		System.out.println("어쨌든 프로그램이 잘 종료되었습니다.");
	}
}
