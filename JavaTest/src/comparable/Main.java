package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "juyeong", "�����̺���ʹٺμ�", "CEO");
        Employee employee2 = new Employee(2, "yeoju", "�����̳��λ������μ�", "ȸ��");
        Employee employee3 = new Employee(3, "yeonsu", "���ֽɸ��кμ�", "����");
        Employee employee4 = new Employee(4, "jihye", "�������ƺμ�", "����");
        //Employee ���밡��
        
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        System.out.println(list);//���� �������
        
		Collections.sort(list); //sort()
		System.out.println("##########");
		System.out.println(list);//�̸� �������
		     }
}



