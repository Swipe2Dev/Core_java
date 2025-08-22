//package Methods;
//
//public class odd_even {
//
//	public static boolean iseven(int age) {
//		
//		return age%2==0;
//		
//	}
//	public static void main(String[] args) {
//		
//		int a=4365463;
//		if(iseven(a)) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
//	}
//
//}
package Methods;

public class odd_even {

	public static String iseven(int age) {
		
		return (age%2==0)?"Even":"Odd";
		
	}
	public static void main(String[] args) {
		
		int a=436546090;
		System.out.println(iseven(a));
	}

}
