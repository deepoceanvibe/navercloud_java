package example.overload;

public class CatMain {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cat("샴", "콩순이");
		
		c2.call();
		c2.call("냐옹");
		
		
		
	}

}
