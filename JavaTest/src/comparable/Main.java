package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "juyeong", "진돌이보고싶다부서", "CEO");
        Employee employee2 = new Employee(2, "yeoju", "음악이내인생이지부서", "회장");
        Employee employee3 = new Employee(3, "yeonsu", "감귤심리학부서", "부장");
        Employee employee4 = new Employee(4, "jihye", "고구마조아부서", "인턴");
        //Employee 재사용가능
        
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        System.out.println(list);//넣은 순서대로
        
		Collections.sort(list); //sort()
		System.out.println("##########");
		System.out.println(list);//이름 순서대로
		     }
}



