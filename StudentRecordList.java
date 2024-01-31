package mini_project;

import java.util.Scanner;

public class StudentRecordList extends StudentRecordMang {

	public static void main(String[] args) {
		// creating scanner object to read input
		Scanner input = new Scanner(System.in);
		int option = 0;
		StudentRecordMang mang = new StudentRecordMang();
		Record record = new Record();

		// initial records
		record.setIdNumber(7410);
		record.setContactNumber(984);
		record.setName("Uma");

		// calling add() record
		mang.add(record);

		do {
			menu();
			option = input.nextInt();

			// switch case
			switch (option) {

			case 1:
				System.out.print(" Student id number ?");
				int idNumber = input.nextInt();
				System.out.print("Student contact number? ");

				int contactNumber = input.nextInt();
				input.nextLine();

				System.out.print("Student name ? ");
				String name = input.nextLine();

				record = new Record(name, idNumber, contactNumber);
				mang.add(record);
				System.out.println(record.toString());
				break;

			case 2:
				System.out.print("Student id number ? ");
				int rId = input.nextInt();
				mang.delete(rId);
				break;

			case 3:
				System.out.print("Student id number ?");
				int rIdNo = input.nextInt();
				mang.update(rIdNo, input);
				break;

			case 4:
				System.out.print("Student id ? ");
				int bookId = input.nextInt();
				if (!mang.find(bookId)) {
					System.out.println("Student id does not exist\n");
				}
				break;

			case 5:
				mang.display();
				break;

			case 6:
				System.out.println("\nThank you for using the program\n");
				System.exit(0);
				break;

			default:
				System.out.println("\nInvalid input\n");

			}

		} while (option != 6);
	}

	private static void menu() {
		System.out.println("MENU");
		System.out.println("1:Add Student");
		System.out.println("2:Delete Student");
		System.out.println("3:Update Student");
		System.out.println("4:Search Student");
		System.out.println("5:Display Student");
		System.out.println("6:Exit program");
		System.out.print("Enter your choice:");
	}

}
