package abstract_abs;

public class MainClass {

	public static void main(String[] args) {
		
		// 상속 전제로 만든 PopupStore은 객체 생성 불가능
		// PopupStore ps = new PopupStore();
		
		PopupStore s = new Store();
		
		s.orderApple();
		s.orderOrange();
		s.orderGrape();
		s.refund();

	}

}
