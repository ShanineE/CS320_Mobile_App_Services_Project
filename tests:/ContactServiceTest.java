package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;  

public class ContactServiceTest {
	
	ContactServiceTest service = new ContactServiceTest();
	
	@Test
	void addContactTest() {
		ContactServiceTest contact = service.addContact("1234", "firstName", "lastName","8885559999", "address");
		assertNotNull(contact); 
	}
	
	private ContactServiceTest addContact(String string, String string2, String string3, String string4,
			String string5) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	void deleteAppointmentTest() {
		ContactServiceTest deleteContact = service.deleteContact("1234") ;
		assertNotNull(deleteContact); 
	}

	private ContactServiceTest deleteContact(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}