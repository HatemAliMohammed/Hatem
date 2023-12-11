package sem451;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class OrderD {
 Scanner scanner=new Scanner(System.in);

 private LocalDate l = null ;

	public void DATE() {

	   try {l=LocalDate.parse(scanner.next());}

	   catch(DateTimeParseException e) {
			System.out.println("Error Wtite Date Like: (2023-09-18) ");
			l=LocalDate.parse(scanner.next());
			}
         }
	public LocalDate getL() {
		return l;
	}
	public void setL(LocalDate l) {
		this.l = l;
	}
  }