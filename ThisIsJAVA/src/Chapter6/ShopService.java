package Chapter6;
//�̱���
public class ShopService {
	//�ܺο��� new�� ������ �� ������ private, �����ʵ� �ڱ��ڽ�Ÿ�� ����, �ڱ��ڽ� ��ü �����Ͽ� �ʱ�ȭ
	private static ShopService singleton = new ShopService();
	private ShopService() {
		
	}
	static ShopService getInstance() {
		return singleton;
	}

}
