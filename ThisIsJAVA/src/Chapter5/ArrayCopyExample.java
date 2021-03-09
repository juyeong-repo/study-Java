package Chapter5;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray= new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length); 
		//원본배열, 복사할 항목 시작인덱스, 도착배열, 붙여넣기할 위치, 몇개 복사하건지 갯수

		for(int i=0;i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+",");
		}
	}

}
