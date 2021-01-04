

public class Parent {

	public void show() {
		System.out.println("Parent Class");
	}
 }

 class Child extends Parent{

	public void show() {
		System.out.println("child class");
	}
	void showUnique() {
		System.out.println("child unique class");
	}
 
public static void main(String[] args) {
	 
	Parent p = new Child();
	p.show();
	
}	

}