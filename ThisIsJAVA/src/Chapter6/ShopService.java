package Chapter6;
//싱글톤
public class ShopService {
	//외부에서 new로 생성할 수 없도록 private, 정적필드 자기자신타입 선언, 자기자신 객체 생성하여 초기화
	private static ShopService singleton = new ShopService();
	private ShopService() {
		
	}
	static ShopService getInstance() {
		return singleton;
	}

}
