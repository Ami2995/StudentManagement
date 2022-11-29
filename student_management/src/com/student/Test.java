package com.student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		File file = new File("student.txt");
		ObjectOutputStream oos = null;
		ObjectInputStream is = null;

		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		int choice = 0;

		System.out.println("======================================================================================");
		System.out.println("**************************STUDENT MANAGEMENT APPLICATION******************************");
		System.out.println("======================================================================================\n");

		do {
			System.out.println("1.    INSERT");
			System.out.println("2.    DISPLAY");
			System.out.println("3.    SEARCH");
			System.out.println("4.    UPDATE");
			System.out.println("5.    DELETE");
			System.out.println("0.    EXIT");

			System.out.print("Please enter your choice: ");
			choice = scan.nextInt();
			
			switch (choice) {

			case 1:
				System.out.print("Enter Student ID: ");
				int id  = scan.nextInt();

				System.out.print("Enter Student Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Student Contact Number: ");
				long num = scan.nextLong();
		
				System.out.print("Enter Student Email Address: ");
				String email = sc.nextLine();

				al.add(new Student(id, name, num, email));

				try {
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(al);
					oos.close();
				} catch (IOException e1) {
					System.out.println("Something went wrong !");
				}

				System.out.println();
				break;

			case 2:
				if (file.isFile()) {
					try {
						is = new ObjectInputStream(new FileInputStream(file));
						al = (ArrayList<Student>) is.readObject();
						is.close();
					} catch (ClassNotFoundException | IOException e) {
						System.out.println("Something went wrong !");
					}

					System.out.println("------------------------------------------------------------------");
					Iterator<Student> itr = al.iterator();
					while (itr.hasNext()) {
						Student student = itr.next();
						System.out.println(student);
					}
					System.out.println("------------------------------------------------------------------");
				}
				break;

			case 3:
				if (file.isFile()) {
					try {
						is = new ObjectInputStream(new FileInputStream(file));
						al = (ArrayList<Student>) is.readObject();
						is.close();
					} catch (ClassNotFoundException | IOException e) {
						System.out.println("Something went wrong !");
					}

					boolean found = false;
					int sId = 0;
					System.out.print("Enter Student ID: ");
					sId = scan.nextInt();
					

					System.out.println("------------------------------------------------------------------");
					Iterator<Student> itr = al.iterator();
					while (itr.hasNext()) {
						Student student = itr.next();
						if (student.getStudentId() == sId) {
							System.out.println(student);
							found = true;
						}
					}
					if (!found) {
						System.out.println("Record Not Found;");
					}
				} else {
					System.out.println("File Not Exist !");
				}
				System.out.println("------------------------------------------------------------------");
				break;

			case 4:
				if (file.isFile()) {
					try {
						is = new ObjectInputStream(new FileInputStream(file));
						al = (ArrayList<Student>) is.readObject();
						is.close();
					} catch (ClassNotFoundException | IOException e) {
						System.out.println("Something went wrong !");
					}

					boolean found = false;
					int sId = 0;
					long numb = 0;
					System.out.print("Enter Student ID: ");
						sId = scan.nextInt();
						
					ListIterator<Student> li = al.listIterator();
					while (li.hasNext()) {
						Student student = li.next();
						if (student.getStudentId() == sId) {
							System.out.print("Enter new name: ");
							name = sc.nextLine();

							System.out.print("Enter new contact: ");
							numb = scan.nextLong();
							
							System.out.print("Enter new email: ");
							email = sc.nextLine();

							li.set(new Student(sId, name, numb, email));

							found = true;
						}
					}
					System.out.println("------------------------------------------------------------------");
					if (found) {
						try {
							oos = new ObjectOutputStream(new FileOutputStream(file));
							oos.writeObject(al);
							oos.close();
							System.out.println("Updated Successfully");
						} catch (IOException e) {
							System.out.println("Something went wrong !");
						}
					} else {
						System.out.println("Record Not Found;");
					}
				} else {
					System.out.println("File Not Exist !");
				}
				System.out.println("------------------------------------------------------------------");
				break;

			case 5:
				if (file.isFile()) {
					try {
						is = new ObjectInputStream(new FileInputStream(file));
						al = (ArrayList<Student>) is.readObject();
						is.close();
					} catch (ClassNotFoundException | IOException e) {
						System.out.println("Something went wrong !");
					}
					boolean found = false;
					int sId = 0;
					System.out.print("Enter Student ID: ");
					sId = scan.nextInt();
					

					System.out.println("------------------------------------------------------------------");
					Iterator<Student> itr = al.iterator();
					while (itr.hasNext()) {
						Student student = itr.next();
						if (student.getStudentId() == sId) {
							itr.remove();
							found = true;
						}
					}
					if (found) {
						try {
							oos = new ObjectOutputStream(new FileOutputStream(file));
							oos.writeObject(al);
							oos.close();
							System.out.println("Deleted Successfully");
						} catch (IOException e) {
							System.out.println("Something went wrong !");
						}
					} else {
						System.out.println("Record Not Found;");
					}
				} else {
					System.out.println("File Not Exist !");
				}
				System.out.println("------------------------------------------------------------------");
				break;

			case 0:
				System.out.println("**************APPLICATION CLOSED****************");
				System.out.println("                   GOOD BYE!");
				System.exit(0);
				break;

			default:
				System.out.println("Please choose valid option");
				break;
			}
		} while (choice != 0);
		scan.close();
		sc.close();
	}
}
