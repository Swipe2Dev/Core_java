//package Methods;
//
//public class maximum_num {
//	public static int max(int num , int num1) {
//		return Math.max(num, num1);
//	}
//
//	public static void main(String[] args) {
//		
//			int num = 7;
//			int num1 = 9;
//				System.out.println(max(num,num1));
//	}
//}

//package Methods;
//
//public class maximum_num {
//	public static int max(int num , int num1) {
//		return (num>num1)?num:num1;
//	}
//
//	public static void main(String[] args) {
//		
//			int num = 19;
//			int num1 = 9;
//			int res=max(num,num1);
//				System.out.println(res);
//	}
//}

package Methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class maximum_num {

    // Method to find the maximum of two numbers using if-else
    public static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        int b = Integer.parseInt(br.readLine());

        int maximum = findMax(a, b);
        System.out.println("Maximum: " + maximum);
    }
}

