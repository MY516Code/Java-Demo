
public class jh_if {
	public static void main(String[] args) {
//商场打折，如果两件商品的总价大于100则优惠20元
		//把原价和打折后的价格分别输出
		int price01 = 55;
		int price02 = 60;
		int money = price01+price02;
		System.out.println("原价是："+money);
		if(money>100) {
			money -= 20;//money = money - 20;
			
		}
	System.out.println("打折后的价钱："+money);
	}

}
