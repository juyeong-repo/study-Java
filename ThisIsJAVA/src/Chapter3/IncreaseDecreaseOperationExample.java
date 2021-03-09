package Chapter3;

public class IncreaseDecreaseOperationExample {
	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("-------------");
		x++; //11
		++x; //12
		System.out.println("x=" + x); //12
		
		System.out.println("-------------");
		y--; //9
		--y; //8
		System.out.println("y=" + y);  //8 
		
		System.out.println("-------------");
		z=x++; 
		/* 증가연산자, 대입연산자 2개이므로..x의 값을 먼저 대입 -> 12출력, 그 후에 13으로 증가 */
		System.out.println("z="+z); //12
		System.out.println("x="+x); //13
		
		System.out.println("-------------");
		z=++x; //14
		System.out.println("z="+z); //14
		System.out.println("x="+x); //14
		
		System.out.println("-------------");
		z= ++x + y++; //15+8=23
		System.out.println("z="+z); //23
		System.out.println("x="+x); //15
		System.out.println("y="+y); //9
	}
}
