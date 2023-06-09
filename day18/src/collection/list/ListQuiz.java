package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz {

	public static void main(String[] args) {
		
		/*
		 * 1. Lotto복권은 1~45범위의 숫자중 6개를 뽑아 추첨하는 복권입니다.
			List<Integer> 타입 변수에 구현체를 대입해주시고
			해당 변수에 중복 없이 6개의 번호가 들어가도록 해 주세요.

			2. 1번 과제를 마친 분들은 당첨될때까지 다시 번호를 무작위로 계속 뽑는 코드를 작성해서
			몇 번 만에 로또복권이 당첨되는지 확인하는 시뮬레이션 코드를 만들어주세요.

			hint : .equals()로 배열끼리 비교할 때는 배열 내부 요소의 순서와 자료 모두를 비교합니다
			ex) [1, 2, 3] 과 [1, 2, 3]은 true로 비교되지만
			[1, 2, 3]과 [1, 3, 2]는 false로 비교됩니다.
		 */
				
		
		List<Integer> userList = new ArrayList<>();
		List<Integer> lottoList = new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			int lottoRandomNum = (int)(Math.random() * 45) + 1;
			lottoList.add(lottoRandomNum);
		} 
		System.out.println("로또리스트는 " + lottoList);
		
		
		
		int count = 0;
		
		while(!userList.equals(lottoList)) {
			
			userList.clear();
			
			for(int i = 0; i < 6; i++) {
				int userRandomNum = (int)(Math.random() * 45) + 1;
				
				if(!userList.contains(userRandomNum)) {
				userList.add(userRandomNum);
			} 
			
				count ++;
			}
		}
		
		System.out.println(userList);
		System.out.println("당첨되셨습니다! " + count + "번 만에 맞추셨습니다.");
		
	
		
		
	
		
		
		

	}

}
