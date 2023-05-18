package org.data;

public class OverloadConcept {
private void employeeDetails(long age) {
	System.out.println("my age is "+age);
}
private void employeeDetails(String name) {
	System.out.println("my name is "+name);
}
private void employeeDetails(long salary,int pSalary) {
	System.out.println("my salary is "+ salary+ "\n"+"my previuos salary is "+ pSalary);
}
private void employeeDetails (long number,float height,double weight) {
	System.out.println("my number is "+number+"\n"+"my height is " +height+"\n"+"my weight is "+weight);
}



private void employeeDetails(boolean a,char initial) {
	System.out.println(a+"\n"+"my initial is "+initial);
}
public static void main(String[] args) {
	OverloadConcept o = new OverloadConcept();
	o.employeeDetails(26l);
	o.employeeDetails("dinesh");
	o.employeeDetails(63000l, 56000);
	o.employeeDetails(9876543210l, 165.6f, 90.5);
	o.employeeDetails(true, 'M');
}
}
