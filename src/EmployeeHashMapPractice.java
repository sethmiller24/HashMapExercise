import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EmployeeHashMapPractice {
	static Map <Integer, Employee> employees = new HashMap<Integer, Employee>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		
		ArrayList<Integer> keys = new ArrayList<Integer>();
		int ID;
		for (int i = 0; i<5; i++) {
			ID = rnd.nextInt();
			while(keys.contains(ID)) {
				ID = rnd.nextInt();
			}
			Teacher teacher1 = new Teacher (ID);
			addEmployee(teacher1);
			keys.add(ID);
		}
		
		for (int i = 0; i<keys.size(); i++) {
			System.out.println("ID: " + keys.get(i)+ " : "+ employees.get(keys.get(i)));
		}
		
		
		
	
	
	}
	
	
	
	public static void addEmployee(Employee emp) {
		employees.put(emp.getID() ,emp);
	}
	
	public void payEmployee(String key) {
		
	}

}
