package comm.innerclasses;

//outer class
class OuterSample{
	
	//inner class
	class InnerSample{
		
		//inner method
		void innerMethod() {
			System.out.println("inner method");
		}
	}
	
	//outer method
	void outerMethod() {
		System.out.println("Outer method");
	}	
}

//main class
public class AboutInnerClass {
	
	//main method
	public static void main(String[] args) {
		
		// //Instantiating the outer class
		 OuterSample o=new  OuterSample();
		 o.outerMethod();
		 
		 OuterSample.InnerSample is=o.new  InnerSample();
		 is.innerMethod();
		
//		 //Instantiating the inner class with the help of outer class 
//		 OuterSample.InnerSample i=new  OuterSample().new InnerSample();
//		 i.innerMethod();
		
	}
}
