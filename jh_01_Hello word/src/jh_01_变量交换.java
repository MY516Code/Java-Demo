
public class jh_01_变量交换 {
	public static void main(String [] args) {
		//  左右手互换
                int a = 5;
		int b = 2;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
