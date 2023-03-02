//author Rachel Stone & Yochi Shtrauber
package ex1;

public class Payroll {

	public static void main(String[] args) {
		Employee[] Arr = new Employee[3];
		Arr[0]= new HourlyEmployee("Moshe", "Tov", 123, 24, 50);
		Arr[1]= new CommissionEmployee("eva", "Shem", 124, (float) 20.15, 10);
		Arr[2]= new BasePlusCommissionEmployee("Sara", "Sain", 125, 15, 10, 30);
		for( int i=0; i<3; i++) {
			System.out.println(Arr[i].toString());
			if(Arr[i] instanceof BasePlusCommissionEmployee)
				System.out.println("earns: "+ Arr[i].earning()+Arr[i].earning()*(10/100));
			else
				System.out.println("earns: "+ Arr[i].earning());
		}
	} 

}
