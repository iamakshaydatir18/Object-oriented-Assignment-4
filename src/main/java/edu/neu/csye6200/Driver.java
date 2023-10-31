package edu.neu.csye6200;

import java.io.IOException;

/**
 * 
 * @author Ruchika Sharma
 * 
 */

public class Driver {
	public static void main(String[] args) throws IOException {
		System.out.println("============Main Execution Start===================\n\n");

         Person.demo();
		 
		System.out.println("\n\n============Main Execution End===================");
	}

	
	/* commented Output
	 Created Objects are 
Student [StudentID=3, GPA=3.3, ID=1, age=24, firstName=Akshay, lastName=Datir, ParentFirstName=Kiran, ParentLastName=Datir]
Student [StudentID=5, GPA=4.0, ID=2, age=21, firstName=Pranav, lastName=Kapse, ParentFirstName=Sambhaji, ParentLastName=Kapse]
Student [StudentID=12, GPA=3.0, ID=3, age=20, firstName=Anuj, lastName=Pawar, ParentFirstName=Niraj, ParentLastName=Pawar]
Student [StudentID=1, GPA=4.0, ID=4, age=26, firstName=Kishor, lastName=Kashid, ParentFirstName=Aditya, ParentLastName=Kashid]
Student [StudentID=23, GPA=3.6, ID=5, age=28, firstName=Kaustubh, lastName=Uchgaonkar, ParentFirstName=Sanket, ParentLastName=Uchgaonkar]

Teacher [hourlyWage=35.0, ID=7, age=42, firstName=Daniel, lastName=Parkar, ParentFirstName=Dana, ParentLastName=Parkar]
Teacher [hourlyWage=40.0, ID=6, age=35, firstName=Saransh, lastName=White, ParentFirstName=Patrick, ParentLastName=White]

Demonstration of inherited methods from Parent parentDetails() and public void introduce()
My name is Akshay Datir. I am 24 years old.
I am a Student and My Parent name is Kiran Datir

My name is Daniel Parkar. I am 42 years old.
I am a teacher and My Parent name is Dana Parkar And houly Wage is 35.0

Sorting of students - 
 sort by ID
Student [StudentID=3, GPA=3.3, ID=1, age=24, firstName=Akshay, lastName=Datir, ParentFirstName=Kiran, ParentLastName=Datir]
Student [StudentID=5, GPA=4.0, ID=2, age=21, firstName=Pranav, lastName=Kapse, ParentFirstName=Sambhaji, ParentLastName=Kapse]
Student [StudentID=12, GPA=3.0, ID=3, age=20, firstName=Anuj, lastName=Pawar, ParentFirstName=Niraj, ParentLastName=Pawar]
Student [StudentID=1, GPA=4.0, ID=4, age=26, firstName=Kishor, lastName=Kashid, ParentFirstName=Aditya, ParentLastName=Kashid]
Student [StudentID=23, GPA=3.6, ID=5, age=28, firstName=Kaustubh, lastName=Uchgaonkar, ParentFirstName=Sanket, ParentLastName=Uchgaonkar]

 sort by StudentID
Student [StudentID=1, GPA=4.0, ID=4, age=26, firstName=Kishor, lastName=Kashid, ParentFirstName=Aditya, ParentLastName=Kashid]
Student [StudentID=3, GPA=3.3, ID=1, age=24, firstName=Akshay, lastName=Datir, ParentFirstName=Kiran, ParentLastName=Datir]
Student [StudentID=5, GPA=4.0, ID=2, age=21, firstName=Pranav, lastName=Kapse, ParentFirstName=Sambhaji, ParentLastName=Kapse]
Student [StudentID=12, GPA=3.0, ID=3, age=20, firstName=Anuj, lastName=Pawar, ParentFirstName=Niraj, ParentLastName=Pawar]
Student [StudentID=23, GPA=3.6, ID=5, age=28, firstName=Kaustubh, lastName=Uchgaonkar, ParentFirstName=Sanket, ParentLastName=Uchgaonkar]

 sort by First Name
Student [StudentID=3, GPA=3.3, ID=1, age=24, firstName=Akshay, lastName=Datir, ParentFirstName=Kiran, ParentLastName=Datir]
Student [StudentID=12, GPA=3.0, ID=3, age=20, firstName=Anuj, lastName=Pawar, ParentFirstName=Niraj, ParentLastName=Pawar]
Student [StudentID=23, GPA=3.6, ID=5, age=28, firstName=Kaustubh, lastName=Uchgaonkar, ParentFirstName=Sanket, ParentLastName=Uchgaonkar]
Student [StudentID=1, GPA=4.0, ID=4, age=26, firstName=Kishor, lastName=Kashid, ParentFirstName=Aditya, ParentLastName=Kashid]
Student [StudentID=5, GPA=4.0, ID=2, age=21, firstName=Pranav, lastName=Kapse, ParentFirstName=Sambhaji, ParentLastName=Kapse]

 sort by Last Name
Student [StudentID=3, GPA=3.3, ID=1, age=24, firstName=Akshay, lastName=Datir, ParentFirstName=Kiran, ParentLastName=Datir]
Student [StudentID=5, GPA=4.0, ID=2, age=21, firstName=Pranav, lastName=Kapse, ParentFirstName=Sambhaji, ParentLastName=Kapse]
Student [StudentID=1, GPA=4.0, ID=4, age=26, firstName=Kishor, lastName=Kashid, ParentFirstName=Aditya, ParentLastName=Kashid]
Student [StudentID=12, GPA=3.0, ID=3, age=20, firstName=Anuj, lastName=Pawar, ParentFirstName=Niraj, ParentLastName=Pawar]
Student [StudentID=23, GPA=3.6, ID=5, age=28, firstName=Kaustubh, lastName=Uchgaonkar, ParentFirstName=Sanket, ParentLastName=Uchgaonkar]

 sort by GPA
Student [StudentID=12, GPA=3.0, ID=3, age=20, firstName=Anuj, lastName=Pawar, ParentFirstName=Niraj, ParentLastName=Pawar]
Student [StudentID=3, GPA=3.3, ID=1, age=24, firstName=Akshay, lastName=Datir, ParentFirstName=Kiran, ParentLastName=Datir]
Student [StudentID=23, GPA=3.6, ID=5, age=28, firstName=Kaustubh, lastName=Uchgaonkar, ParentFirstName=Sanket, ParentLastName=Uchgaonkar]
Student [StudentID=5, GPA=4.0, ID=2, age=21, firstName=Pranav, lastName=Kapse, ParentFirstName=Sambhaji, ParentLastName=Kapse]
Student [StudentID=1, GPA=4.0, ID=4, age=26, firstName=Kishor, lastName=Kashid, ParentFirstName=Aditya, ParentLastName=Kashid]
	 */
}
