package mini_project;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecordMang extends Record {
	// creating an empty Linkedlist
	LinkedList<Record> list = new LinkedList<>();

	// Adding records
	public void add(Record record) {
		// checking if a record is already exist ot not
		if (!find(record.getIdNumber())) {
			list.add(record);
		} else {
			System.out.println("Record already exists in the record");
		}
	}

	// searching record by id number
	public boolean find(int idNumber) {
		for (Record i : list) {
			if (i.getIdNumber() == idNumber) {
				System.out.println(i);
				return true;
			}
		}

		return false;
	}

	// delete record by id number
	public void delete(int recIdNumber) {
		Record recordDe1 = null;

		for (Record i1 : list) {
			if (i1.getIdNumber() == recIdNumber) {
				recordDe1 = i1;
			}
		}
		// if record is null ,then show error message otherwise remove record
		if (recordDe1 == null) {
			System.out.println("Invalid record Id");
		} else {
			list.remove(recordDe1);
			System.out.println("Successfully removed record ");
		}
	}

	// Finding record & checking record by id number
	public Record findRecord(int idNumber) {
		for (Record i : list) {
			if (i.getIdNumber() == idNumber) {
				return i;
			}
		}
		return null;

	}

	// updating record & display message
	public void update(int id, Scanner input) {
		if (find(id)) {
			Record rec = findRecord(id);
			System.out.print("What is the new Student name?");
			String name = input.nextLine();

			rec.setIdNumber(idNumber);
			rec.setName(name);
			rec.setContactNumber(contactNumber);
			System.out.println("Record updated Successfully");

		} else {
			System.out.println("Record not found in student list");
		}

	}

	// display record
	public void display() {
		if (list.isEmpty()) {
			System.out.println("The list has no record\n");
		}
		for (Record record : list) {
			System.out.println(record.toString());
		}
	}
}
