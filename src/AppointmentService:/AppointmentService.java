package Test;

import java.util.Date; 

public class AppointmentService {
	
	private Appointment appointment; 
	//add appointment
	public Appointment addApointment(String appointmentId, Date appointmentDate, String appointmentDescription) {
		this.appointment = new Appointment(appointmentId, appointmentDate, appointmentDescription);
		return appointment; 
	}
	//delete appointment
	public Appointment deleteAppointment(String appointmentId) {
		if (appointment != null && appointment.getAppointmentId().equals(appointmentId)) {
			Appointment deleteAppointment = appointment; 
			appointment = null; 
			return deleteAppointment; 
		}
		return appointment;
	}
	public Appointment addAppointment(String string, Date date, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
	

