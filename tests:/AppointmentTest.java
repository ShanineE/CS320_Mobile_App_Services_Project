package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AppointmentTest {
	@Test
	void validAppointmentTest() {
		
		Appointment appointment = new Appointment ("12234", new Date(System.currentTimeMillis()), "Description");
		assertEquals("1234", appointment.getAppointmentId()); 
		assertNotNull(appointment.getAppointmentDate());
		assertEquals("Description", appointment.appointmentDescription()); 
	}
	
	@Test
	//invalid ID 
	void InvalidAppointmentId() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678910", new Date(System.currentTimeMillis()), "Description" ); 
		});
	}
	@Test
	//Invalid date 
	void InvalidAppointmentDate() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678910", new Date(System.currentTimeMillis()- 1), "Description" ); 
		});
	}
	
	@Test
	//Invalid description 
	void InvalidAppointmentDescription() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678910", new Date(System.currentTimeMillis()- 1), "Description is too long it will be over 50 characters. " ); 
		});
	}
}
