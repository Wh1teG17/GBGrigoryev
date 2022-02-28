/**
 * @name Homework 5
 * @author Grigoryev
 * @date 28.02.2022
 */
 
 class HomeWork5 {
	 
	 public static void main(String[] args) {
		 Employee[] employees = {
			 new Employee("Ivanov Ivan", "Engineer",
			     "iivanov@mail.cu", "2323123", 30000, 30),
			 new Employee("Petrov Petr", "Lead Engineer",
			     "ppetrov@mail.cu", "1212123", 42000, 39),
			 new Employee("Vasilev Vasya", "Head of Head",
			     "vvasilev@mail.cu", "1231234", 52000, 55),
			 new Employee("Sidorov Sega", "Sergeunt",
			     "ssidorov@mail.cu", "1232123", 60000, 42),
			 new Employee("Sergeev Sidor", "Trainer",
			     "ssergeev@mail.cu", "2323245", 20000, 26)
		 };
		 
		 for (Employee employee : employees) {
			 if (employee.getAge()>40) {
				 System.out.println(employee);
			 }
		 }
	 }
 }
 

 
			 
			 
			 