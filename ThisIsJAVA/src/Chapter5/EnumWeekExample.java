package Chapter5;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today=null; //����Ÿ�� ���� ����
		
		Calendar cal=Calendar.getInstance(); //�� �޼ҵ尡 �����ϴ� Calendar ��ü ���
		int week= cal.get(Calendar.DAY_OF_WEEK); //��(1)~��(7) ���� ����
		
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
		
		
		System.out.println("���ÿ���->"+today);

		
		if(today==Week.SUNDAY) {
			System.out.println("�Ͽ����� ���³��̾�");
			
		}else
			System.out.println("�ڹ� �����ϴ³�~");
	}
}
