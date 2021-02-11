package comm.innerclasses;

public class RegularInnerClasses {
	// show method in outer class
	void show() {
		int a=20;
		int b=12;
		System.out.println("outerClass method");
	}
	//creating innerClass
	class InnerClass{
		int a=1;
		int b=2;
		//innerclass method
		void display() {
			System.out.println("InnerClass method:"+a);
		}
		
	}
	//main method
		public static void main(String[] args) {
			
			//Here we can access only the innerclass methods
			new RegularInnerClasses().new InnerClass().display();
		}

}
