import java.util.Scanner;

	public class Methods{
		public static void main(String[] args){
			Methods methods = new Methods();
			methods.method1();
			Index.main(null);
		}
		public void method1(){
			System.out.println("Method 1 here, I am calling Mehod 2");
			method2();
		}
		public void method2(){
			System.out.println("Hi Method1. from Method2, I am calling Method3");
			method3();
			System.out.println("Method3 says hello to you Method1");
		}
		public void method3(){
			System.out.println("Hi Method2. from Method3, Tell Method1 I said hello");
	}
}


