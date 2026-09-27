import java.util.Scanner;

public class examGrade {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Declare variables
double score;
char grade;
String comment;

// Get score
System.out.print("Enter student's exam score: ");
score = input.nextDouble();

// Validate score
if (score >= 0 && score <= 100) {

    // Determine grade using nested if statements
    if (score >= 90) {
        grade = 'A';
        comment = "Excellent";
    }
    else {
        if (score >= 80) {
            grade = 'B';
            comment = "Very Good";
        }
        else {
            if (score >= 70) {
                grade = 'C';
                comment = "Good";
            }
            else {
                if (score >= 60) {
                    grade = 'D';
                    comment = "Needs Improvement";
                }
                else {
                    grade = 'F';
                    comment = "Failing";
                }
            }
        }
    }

    // Display results
    System.out.println("Score: " + score);
    System.out.println("Grade: " + grade);
    System.out.println("Comment: " + comment);
}
else {
    System.out.println("Invalid score. Please enter a score between 0 and 100.");
}

input.close();
}
}
