package custom;

import custom.AnnotationUse1;
import custom.AnnotationUse2;
import custom.InsertDataAnnoatationHandler;

public class UseInsert {
	public static void main(String[] args) {
		AnnotationUse1 exam01 = new AnnotationUse1();
		InsertDataAnnoatationHandler.process(exam01);
		
		AnnotationUse2 exam02 = new AnnotationUse2();
		InsertDataAnnoatationHandler.process(exam02);
		
		System.out.println(exam01);
		System.out.println(exam02);
	}
}
