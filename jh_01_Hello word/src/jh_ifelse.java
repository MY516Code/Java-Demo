import java.util.Scanner;
public class jh_ifelse {
	public static void main(String[] args) {
		//判断一个数是奇数还是偶数
		//num % 2 != 0     num % 2 == 0 相同条件
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0 ) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
	}

}
