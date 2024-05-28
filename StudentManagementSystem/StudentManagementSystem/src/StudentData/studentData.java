package StudentData;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String sname;
	private String Dept;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", Dept=" + Dept + "]";
	}

	public Student(String sname, String dept) {
		super();
		this.sname = sname;
		Dept = dept;
	}
}

public class studentData {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n***** MENU *****");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Remove Student");
			System.out.println("4. Update Student");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Student Name:");
				String name = sc.next();
				System.out.println("Enter Student Department:");
				String dept = sc.next();
				arrayList.add(new Student(name, dept));
				System.out.println("Student added successfully!");
				break;
			case 2:
				if (arrayList.isEmpty()) {
					System.out.println("No students to display.");
				} else {
					System.out.println("\n***** LIST OF STUDENTS *****");
					for (Student student : arrayList) {
						System.out.println(student);
					}
				}
				break;
			case 3:
				if (arrayList.isEmpty()) {
					System.out.println("No students to remove.");
				} else {
					System.out.println("Enter the index of student to remove:");
					int index = sc.nextInt();
					if (index >= 0 && index < arrayList.size()) {
						arrayList.remove(index);
						System.out.println("Student removed successfully!");
					} else {
						System.out.println("Invalid index!");
					}
				}
				break;
			case 4:
				if (arrayList.isEmpty()) {
					System.out.println("No students to update.");
				} else {
					System.out.println("Enter the index of student to update:");
					int index = sc.nextInt();
					if (index >= 0 && index < arrayList.size()) {
						System.out.println("Enter updated Student Name:");
						String updatedName = sc.next();
						System.out.println("Enter updated Student Department:");
						String updatedDept = sc.next();
						arrayList.set(index, new Student(updatedName, updatedDept));
						System.out.println("Student updated successfully!");
					} else {
						System.out.println("Invalid index!");
					}
				}
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
				break;
			}
		} while (choice != 5);

		sc.close();
	}
}

