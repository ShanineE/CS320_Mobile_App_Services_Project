package Test;
public class ContactService {
	
	private Contact contact; 
	//add contact
	public Contact addContact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		this.contact = new Contact(contactId, firstName, lastName, phoneNumber, address);
		return contact; 
	}
	//delete contact
	public Contact deleteContact(String contactId) {
		if (contact != null && contact.getContactId().equals(contactId)) {
			Contact deleteContact = contact; 
			contact = null; 
			return deleteContact; 
		}
		return contact;
	}
	public Contact addContact(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
	