package Chapter5;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today=null; //열거타입 변수 선언
		
		Calendar cal=Calendar.getInstance(); //이 메소드가 리턴하는 Calendar 객체 얻기
		int week= cal.get(Calendar.DAY_OF_WEEK); //일(1)~토(7) 숫자 리턴
		
		switch(week) {
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;
		case 4:
			today=Week.WEDNESDAY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6:
			today=Week.FRIDAY;
			break;
		case 7:
			today=Week.SATURDAY;
			break;
		}
		
		
		System.out.println("오늘요일->"+today);

		
		if(today==Week.SUNDAY) {
			System.out.println("일요일은 쉬는날이야");
			
		}else
			System.out.println("자바 공부하는날~");
	}
}
