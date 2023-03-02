//author Rachel Stone & Yochi Shtrauber
package ex1;

public abstract class Employee {
	
	String firstName;
	String lastName;
	int id;
	
	//constructors
	public Employee(String firstName, String lastName, int id) {
		try {
			this.firstName=firstName;
			this.lastName=lastName;
			this.id=id;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Employee() {
		firstName="plony";
		lastName="almony";
		id=0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		try {
			this.firstName = firstName;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		try {
			this.lastName = lastName;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		try {
			this.id = id;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}
	
	public abstract float earning();
	
}

