package poly.instanceof_;

public class Cat {

	private String name;
	private int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void meow() {
		System.out.println(name + " : " + "야옹~");
	}
}
