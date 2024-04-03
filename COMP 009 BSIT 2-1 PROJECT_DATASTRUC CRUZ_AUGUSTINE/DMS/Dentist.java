package DMS;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Dentist {
	static String name;
	String tel_no;
	String email;
	Boolean is_available;
	String appointed = Client.name;
	LocalDate app_date; // = LocalDate.of(int year, int month, int dayOfMonth)
}
