import java.util.Scanner;
public class jh_human_computer {
	public static void main(String[] args) {
		//�ж�һ��������������ż��
		//num % 2 != 0     num % 2 == 0 ��ͬ����
		Scanner b = new Scanner(System.in);
		System.out.println("����������:");
		int num = b.nextInt();
		if(num % 2 == 0 ) {
			System.out.println("ż��");
		}else {
			System.out.println("����");
		}
	}


}




