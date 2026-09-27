import java.util.Scanner;

public class weeklyWages {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Declare variables
double hourlyWage;
double hoursWorked;
double weeklyWages;

// Read wage and hours
System.out.print("Enter hourly wage: ");
hourlyWage = input.nextDouble();

System.out.print("Enter hours worked: ");
hoursWorked = input.nextDouble();

if (hoursWorked <= 40) {
weeklyWages = hourlyWage * hoursWorked;
}
else {
weeklyWages = (hourlyWage * 40) + ((hoursWorked - 40) * hourlyWage * 1.5);
}

System.out.println("Weekly wages = " + weeklyWages);

input.close();
}
}
