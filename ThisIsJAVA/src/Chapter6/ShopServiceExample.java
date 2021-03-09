package Chapter6;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1=ShopService.getInstance();
		ShopService obj2=ShopService.getInstance();

		
		if (obj1==obj2) { //참조하는 객체가 같다면
			System.out.println("같은 ShopService 객체입니다");
			
		}else {
			System.out.println("다른 ShopService 객체입니다");
		}
	}

}
