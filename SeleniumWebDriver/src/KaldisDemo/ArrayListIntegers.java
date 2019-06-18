package KaldisDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIntegers {
	

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
			ArrayList<Integer> iron = new ArrayList<Integer>();
			iron.add(1); //array list 0
			iron.add(2); //array list 1
			iron.add(3); //array list 2
			iron.add(4); //array list 3
			
			System.out.println(iron);
			System.out.println(iron.get(0));
			
		//	iron.remove(1);
		//	System.out.println(iron);
			
			System.out.println(iron.size());
			
			for (int man : iron) {
				System.out.println(man);
			}

			
			//employee class object
			Employee e1 = new Employee("abe",25,"soccer");
			Employee e2 = new Employee("tom",21,"basket");
			Employee e3 = new Employee("susan",20,"softball");
			//create arraylist
			ArrayList<Employee> mountain = new ArrayList<Employee>();
			mountain.add(e1);
			mountain.add(e2);
			mountain.add(e3);
			
			Iterator lion = mountain.iterator();
			
			while(lion.hasNext()) {
				Employee temp = (Employee) lion.next();
				System.out.println(temp.name);
				System.out.println(temp.age);
				System.out.println(temp.dept);
				
			}
			
		
			
			
	
	}

}
