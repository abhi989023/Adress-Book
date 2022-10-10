
public class Main {
	 public static void main(String args[]) {

	        System.out.println("Welcome to Address Book Program");

	        Contact contact1 = new Contact();
	        Contact contact2 = new Contact();
	        
	        contact1.lastName = "Awasthi";
	        contact1.address = "25, Bharathiyar 4th street, S.s.colony";
	        contact1.city = "Amravati";
	        contact1.state = "Maharastra";
	        contact1.pinCode = 444106;
	        contact1.phoneNumber = 7774922116L;
	        contact1.emailId = "aa75@gmail.com";

	        contact2.lastName = "Tiwari";
	        contact2.address = "25, Bharathiyar 4th street, S.s.colony";
	        contact2.city = "Amravati";
	        contact2.state = "Maharastra";
	        contact2.pinCode = 444106;
	        contact2.phoneNumber = 9890234946L;
	        contact2.emailId = "mt789@gmail.com";


	        AddressBook addressBook = new AddressBook();
	        addressBook.add(contact1);
	        addressBook.add(contact2);
	        
	        UserInterface userInterface = new UserInterface();
	        userInterface.print(addressBook.getContactList());
	    }
}
