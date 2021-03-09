package Chapter3;

public class DenyLogicOperationExample {

	public static void main(String[] args) {
		boolean play=true;
		System.out.println(play); //true
		
		play=!play; //false ¥Î¿‘
		System.out.println(play);

		play=!play;
		System.out.println(play); //true
	}

}
