
public class jh_if {
	public static void main(String[] args) {
//�̳����ۣ����������Ʒ���ܼ۴���100���Ż�20Ԫ
		//��ԭ�ۺʹ��ۺ�ļ۸�ֱ����
		int price01 = 55;
		int price02 = 60;
		int money = price01+price02;
		System.out.println("ԭ���ǣ�"+money);
		if(money>100) {
			money -= 20;//money = money - 20;
			
		}
	System.out.println("���ۺ�ļ�Ǯ��"+money);
	}

}
