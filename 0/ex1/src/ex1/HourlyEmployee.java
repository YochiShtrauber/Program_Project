package ex1;

public class HourlyEmployee extends Employee {
	
	int hours;
	float wage;

	public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
		super(firstName, lastName, id);
		// TODO Auto-generated constructor stub
		try {
			this.hours=hours;
			this.wage=wage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
		super();
		this.hours=0;
		this.wage=0;
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		try {
			this.hours = hours;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public float getWage() {
		return wage;
	}

	public void setWage(float wage) {
		try {
			this.wage = wage;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hours=" + hours + ", wage=" + wage + ", firstName=" + firstName + ", lastName="
				+ lastName + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HourlyEmployee other = (HourlyEmployee) obj;
		if (hours != other.hours)
			return false;
		if (Float.floatToIntBits(wage) != Float.floatToIntBits(other.wage))
			return false;
		return true;
	}

	@Override
	public float earning() {
		// TODO Auto-generated method stub
		return hours*wage;
	}

}
