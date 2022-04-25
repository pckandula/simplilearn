package practice;

public class employeeDetails {
	public static void main(String[] args) {
		employee e1 = new employee(1234, "ramesh", "ramesh@gmail.com");
		employee e2 = new employee(1235, "suresh", "suresh@gmail.com");
		employee e3 = new employee(1234, "ganesh", "ganesh@gmail.com");
		e1.disply();
		e2.disply();
		e3.disply();
	}
}

	  class employee {
		int employeeCode;
		String employeeName;
		String employeeMail;
		employee(int empCode, String empName , String empMail){
			employeeCode = empCode;
			employeeName = empName;
			employeeMail = empMail;
			
		}
		public void disply(){
			System.out.println("The employee details  are :"+ employeeName + " "+  employeeCode + " " + employeeMail );
			//System.out.println("The employee code is ;"+ employeeCode);
			//System.out.println("The employee mail is ;"+ employeeMail);
		}
	}


