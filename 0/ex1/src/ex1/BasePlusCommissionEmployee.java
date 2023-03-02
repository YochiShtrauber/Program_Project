package ex1;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	float baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, int id, int grossSales, int commision,float baseSalary) {
		super(firstName, lastName, id, grossSales, commision);
		// TODO Auto-generated constructor stub
		try {
			this.baseSalary=baseSalary;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BasePlusCommissionEmployee() {
		// TODO Auto-generated constructor stub
		super();
		baseSalary=0;
	}

	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		try {
			this.baseSalary = baseSalary;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasePlusCommissionEmployee other = (BasePlusCommissionEmployee) obj;
		if (Float.floatToIntBits(baseSalary) != Float.floatToIntBits(other.baseSalary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + ", grossSales=" + grossSales + ", commision="
				+ commision + ", firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}
	@Override
	public float earning() {
		// TODO Auto-generated method stub
		return baseSalary + (commision/100)*grossSales;
	}

}
