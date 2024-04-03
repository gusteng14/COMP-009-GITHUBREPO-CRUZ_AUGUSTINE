package DMS;

import java.time.LocalDate;

public class Main { // TEST
	public static void main(String[] args) {
		Client client = new Client();
		Dentist dentist = new Dentist();
		
		client.name = "Augustine Francis Cruz";
		client.tel_no = "09669927245";
		client.email = "gusteng14@gmail.com";
		client.appointed = dentist.name;
		client.serviceType = "Cleaning";
		
		dentist.name = "Sophia Garcia";
		dentist.email = "sophiag@gmail.com";
		dentist.tel_no = "09234412344";
		dentist.is_available = true;
		dentist.app_date = LocalDate.of(2024, 4, 4);
		
		System.out.println("Client (1) Details: " );
		System.out.println("Name: " + client.name);
		System.out.println("Telephone No.: " + client.tel_no);
		System.out.println("Email: " + client.email);
		System.out.println("Appointed Dentist: " + client.appointed);
		System.out.println("Service: " + client.serviceType);
		System.out.println(" ");
		System.out.println("Dentist (1) Details: " );
		System.out.println("Name: " + dentist.name);
		System.out.println("Telephone No.: " + dentist.tel_no);
		System.out.println("Email: " + dentist.email);
		System.out.println("Appointed Client: " + dentist.appointed);
		System.out.println("Appointment Date: " + dentist.app_date);
		System.out.print("Status: ");
		if (dentist.is_available == true) {
			System.out.println("Available");
		}

		
	}

}
