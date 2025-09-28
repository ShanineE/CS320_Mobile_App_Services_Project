package Test;

import java.util.Date;

public class Appointment {
	private String appointmentId; 
	private Date appointmentDate; 
	private String appointmentDescription;
	
	public Appointment(String appointmentId,Date appointmentDate, String appointmentDescription) {
		if (appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID. ");
		}
	
		if (appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Inavlid date. ");
		}
		
		if (appointmentDescription == null || appointmentDescription.length()>50) {
			throw new IllegalArgumentException("Invalid description. ");
		}
		
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate; 
		this.appointmentDescription = appointmentDescription;
		
}
	public String getAppointmentId( ) {
		return appointmentId;
	}
	
	public Date getAppointmentDate() {
		return appointmentDate; 
	}
	public String appointmentDescription() {
		return appointmentDescription; 
	}
}
