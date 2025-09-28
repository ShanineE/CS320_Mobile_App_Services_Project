package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; 
import java.util.Date; 

public class AppointmentServiceTest {
	
	AppointmentService service = new AppointmentService();
	
	@Test
	void addAppointmentTest() {
		Appointment appointment = service.addAppointment("1234", new Date(System.currentTimeMillis()), "Description");
		assertNotNull(appointment); 
	}
	
	@Test
	void deleteAppointmentTest() {
		Appointment deleteAppointment = service.deleteAppointment("1234") ;
		assertNotNull(deleteAppointment); 
	}
}