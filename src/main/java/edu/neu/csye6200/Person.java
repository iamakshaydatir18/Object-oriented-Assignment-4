package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Person {

	int ID;
	int age;
	String firstName;
	String lastName;
	String ParentFirstName;
	String ParentLastName;
	
	static List<Student> students = new ArrayList<>();
	static List<Teacher> teachers = new ArrayList<>();

	public Person(int iD, int age, String firstName, String lastName, String parentFirstName, String parentLastName) {
		super();
		ID = iD;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		ParentFirstName = parentFirstName;
		ParentLastName = parentLastName;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getParentFirstName() {
		return ParentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		ParentFirstName = parentFirstName;
	}

	public String getParentLastName() {
		return ParentLastName;
	}

	public void setParentLastName(String parentLastName) {
		ParentFirstName = parentLastName;
	}

	@Override
	public String toString() {
		return "Person [ID=" + ID + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", ParentFirstName=" + ParentFirstName + ", ParentLastName=" + ParentLastName + "]";
	}
	
	public void parentDetails() {
		
		System.out.println("My Parent name is "+ParentFirstName+" "+ParentFirstName);
	}
	
	public void introduce() {
		
		System.out.println("My name is "+firstName+" "+lastName+". I am "+age+" years old.");
	}

	class Student extends Person {

		int StudentID;
		double GPA;

		public Student(int iD, int age, String firstName, String lastName, String parentFirstName,
				String parentLastName, int studentID, double gPA) {
			super(iD, age, firstName, lastName, parentFirstName, parentLastName);
			StudentID = studentID;
			GPA = gPA;
		}

		public int getStudentID() {
			return StudentID;
		}

		public void setStudentID(int studentID) {
			StudentID = studentID;
		}

		public double getGPA() {
			return GPA;
		}

		public void setGPA(double gPA) {
			GPA = gPA;
		}
		
		@Override
		public void parentDetails() {
			
			System.out.println("I am a Student and My Parent name is "+ParentFirstName+" "+ParentLastName);
		}
		
		@Override
		public void introduce() {
			
			System.out.println("My name is "+firstName+" "+lastName+". I am "+age+" years old.");
		}

		@Override
		public String toString() {
			return "Student [StudentID=" + StudentID + ", GPA=" + GPA + ", ID=" + ID + ", age=" + age + ", firstName="
					+ firstName + ", lastName=" + lastName + ", ParentFirstName=" + ParentFirstName
					+ ", ParentLastName=" + ParentLastName + "]";
		}

		

	}

	class Teacher extends Person {

		double hourlyWage;

		public Teacher(int iD, int age, String firstName, String lastName, String parentFirstName,
				String parentLastName, double hourlyWage) {
			super(iD, age, firstName, lastName, parentFirstName, parentLastName);
			this.hourlyWage = hourlyWage;
		}

		public double getHourlyWage() {
			return hourlyWage;
		}

		public void setHourlyWage(double hourlyWage) {
			this.hourlyWage = hourlyWage;
		}
		
		@Override
		public void parentDetails() {
			
			System.out.println("I am a teacher and My Parent name is "+ParentFirstName+" "+ParentLastName+" And houly Wage is "+hourlyWage);
		}
		
		@Override
		public void introduce() {
			
			System.out.println("My name is "+firstName+" "+lastName+". I am "+age+" years old.");
		}
		
		@Override
		public String toString() {
			return "Teacher [hourlyWage=" + hourlyWage + ", ID=" + ID + ", age=" + age + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", ParentFirstName=" + ParentFirstName + ", ParentLastName="
					+ ParentLastName + "]";
		}

		

	}

	public class FileUtil {

		public void readCSV(String path) throws IOException {
			
			

			try {
				FileReader io = new FileReader(path);
				BufferedReader br = new BufferedReader(io);

				String inputLine = null;
				while ((inputLine = br.readLine()) != null) {

					String[] fields = inputLine.split(",");

					int id = Integer.parseInt(fields[0]);

					if (id > 5) {

						int age = Integer.parseInt(fields[1]);
						String firstName = fields[2];
						String lastName = fields[3];
						String parentFirstName = fields[4];
						String parentLastName = fields[5];
						double hourlyWage = Double.parseDouble(fields[6]);

						Teacher teacher = new Teacher(id, age, firstName, lastName, parentFirstName, parentLastName,
								hourlyWage);
						teachers.add(teacher);

					} else {

						int age = Integer.parseInt(fields[1]);
						String firstName = fields[2];
						String lastName = fields[3];
						String parentFirstName = fields[4];
						String parentLastName = fields[5];
						int studentId = Integer.parseInt(fields[6]);
						double gpa = Double.parseDouble(fields[7]);

						Student student = new Student(id, age, firstName, lastName, parentFirstName, parentLastName,
								studentId, gpa);
						students.add(student);

					}

				}
			} catch (IOException e) {

				e.printStackTrace();

			}
			

		}
		
		public void writeCSV(String path,List<Student> student,List<Teacher> teacher) {
			
			
			try {
				
			FileWriter fw = new FileWriter(path);
			BufferedWriter out= new BufferedWriter(fw);
		
			for (Student a : student) {
			out.write(a.toString());
			out.newLine();
			}
			
			for (Teacher a : teacher) {
				out.write(a.toString());
				out.newLine();
			}
			
			out.flush();
			} catch (Exception e) {
			e.printStackTrace();
			}
			
		}

	}

	public static void demo() throws IOException {
		
		
		Person p = new Person();
		FileUtil file = p.new FileUtil();
		
		//read csv file and create objects for Student and teacher with inherited person
		file.readCSV("data.csv");
		
		//Created student and teacher display
		System.out.println("Created Objects are ");
		for(Student a:students) {
			System.out.println(a.toString());
		}
		
		System.out.println();
		for(Teacher a:teachers) {
			System.out.println(a.toString());
		}
		
		//Write to csv file
		file.writeCSV("out.csv",students,teachers);
		
		//Demonstration of inherited methods from Parent parentDetails() and public void introduce()
		System.out.println();
		System.out.println("Demonstration of inherited methods from Parent parentDetails() and public void introduce()");
		Student student1 = students.get(0);
		
		student1.introduce();
		student1.parentDetails();
		System.out.println();
		Teacher teacher1 = teachers.get(0);
		
		teacher1.introduce();
		teacher1.parentDetails();
		
		System.out.println();
		
		System.out.println("Sorting of students - ");
		
		students.sort( (o1,o2) -> ((Integer) o1.getID()).compareTo((Integer) o2.getID()));
		
		System.out.println(" sort by ID");
		for(Student a:students) {
			System.out.println(a.toString());
		}
		System.out.println();
		students.sort( (o1,o2) -> ((Integer) o1.getStudentID()).compareTo((Integer) o2.getStudentID()));
		System.out.println(" sort by StudentID");
		for(Student a:students) {
			System.out.println(a.toString());
		}
		System.out.println();
		students.sort( (o1,o2) -> (o1.getFirstName()).compareTo( o2.getFirstName()));
		System.out.println(" sort by First Name");
		for(Student a:students) {
			System.out.println(a.toString());
		}
		System.out.println();
		students.sort( (o1,o2) -> (o1.getLastName()).compareTo( o2.getLastName()));
		System.out.println(" sort by Last Name");
		for(Student a:students) {
			System.out.println(a.toString());
		}
		System.out.println();
		students.sort( (o1,o2) -> ((Double) o1.getGPA()).compareTo((Double) o2.getGPA()));
		System.out.println(" sort by GPA");
		for(Student a:students) {
			System.out.println(a.toString());
		}

	}

}
