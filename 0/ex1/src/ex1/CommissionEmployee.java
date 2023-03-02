package ex1;

public class CommissionEmployee extends Employee {
	
	float grossSales;
	int commision;

	public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision) {
		super(firstName, lastName, id);
		// TODO Auto-generated constructor stub
		try {
			this.grossSales=grossSales;
			this.commision=commision;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public CommissionEmployee() {
		// TODO Auto-generated constructor stub
		super();
		grossSales=0;
		commision=0;
	}

	public float getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		try {
			this.grossSales = grossSales;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		try {
			this.commision = commision;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commision=" + commision + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommissionEmployee other = (CommissionEmployee) obj;
		if (commision != other.commision)
			return false;
		if (grossSales != other.grossSales)
			return false;
		return true;
	}

	@Override
	public float earning() {
		// TODO Auto-generated method stub
		return (commision/100)*grossSales;
	}

}
