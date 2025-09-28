package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
	public ContactTest(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void validContactTest() {
		
		Contact contact = new Contact("12234", "firstName", "lastName","8885551111", "123 main st");
		assertEquals("1234", contact.getContactId());
        assertEquals("firstName", contact.getFirstName());
        assertEquals("lastName", contact.getLastName());
        assertEquals("8885551111", contact.getPhoneNumber());
        assertEquals("123 main st", contact.getAddress());
	}

	@Test
	//invalid ID 
	void InvalidContacttId() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactTest("122345678910", "firstName", "lastName","8885551111", "123 main st"); 
		});
	}
	@Test
	//Invalid first name 
	void InvalidFirstName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactTest("122345678910", "firstNameistoolong", "lastName","8885551111", "123 main st"); 
		});
	}
	@Test
	//Invalid last name 
	void InvalidLastName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactTest("122345678910", "firstName", "lastNameistoolong","8885551111", "123 main st"); 
		});
	}
	@Test
	void InvalidPhoneNumber() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactTest("122345678910", "firstName", "lastName","888555", "123 main st"); 
		});
	}
	void InvalidAddress() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContactTest("122345678910", "firstName", "lastName","8885551111", "123 main st is too long, it is invalid."); 
		});
	}
}
