import java.util.Scanner;
public class jh_ifelse {
	public static void main(String[] args) {
		//�ж�һ��������������ż��
		//num % 2 != 0     num % 2 == 0 ��ͬ����
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0 ) {
			System.out.println("ż��");
		}else {
			System.out.println("����");
		}
	}

}
