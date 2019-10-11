import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateDifference {

	public static void main(String[] args) {

		LocalDate endofCentury = LocalDate.of(2014, 01, 01);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(endofCentury, now);

		System.out.printf("Difference is %d years, %d months and %d days old", diff.getYears(), diff.getMonths(),
				diff.getDays());

		LocalDate dateOfBirth = LocalDate.of(1980, Month.JULY, 4);
		LocalDate currentDate = LocalDate.now();
		long diffInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
		long diffInMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);
		long diffInYears = ChronoUnit.YEARS.between(dateOfBirth, currentDate);

		System.out.println("\ndiffInDays: "+diffInDays);
		System.out.println("diffInMonths: "+diffInMonths);
		System.out.println("diffInYears: "+diffInYears);
	}

}
