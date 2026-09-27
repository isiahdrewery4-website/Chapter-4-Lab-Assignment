import java.util.Scanner;

public class studentGrade {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Declare variables
double score;
char grade = 'F' ;

// Read score
System.out.print("Enter student's score: ");
score = input.nextDouble();

if (score >= 90) {
grade = 'A';
}

System.out.println("Grade = " + grade);

input.close();
}
}
