package arraycopy;
public class ArrayCopy {

	   public static void main(String[] args) {

	      int arr1[] = { 0, 1, 2, 3, 4, 5 };
	      int arr2[] = { 5, 10, 20, 30, 40, 50 };
	    
	     // Object src ����, int srcPos �ҽ��迭�� ������, Object dest �����迭, int destPos�����ȿ��� ����, int length ���� ���� 
	      System.arraycopy(arr1, 0, arr2, 0, 1); 
	      System.out.print("array2 = ");
	      System.out.print(arr2[0] + " ");
	      System.out.print(arr2[1] + " ");
	      System.out.print(arr2[2] + " ");
	      System.out.print(arr2[3] + " ");
	      System.out.print(arr2[4] + " ");
	   }
	}


