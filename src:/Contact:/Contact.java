package Test;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName; 
	private String phoneNumber; 
	private String address; 
	
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("contact Id cant be longer than 10 character");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First name cant be longer than 10 characters");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last name cant be longer than 10 characters");
		}
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Phone number name cant be longer than 10 digits");
		}
		if(address == null || firstName.length() > 30) {
			throw new IllegalArgumentException("Address cant be longer than 30 characters");
		}
		
		this.contactId = contactId;
		this.firstName = firstName; 
		this.lastName = lastName;
		this.phoneNumber = phoneNumber; 
		this.address = address; 
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
