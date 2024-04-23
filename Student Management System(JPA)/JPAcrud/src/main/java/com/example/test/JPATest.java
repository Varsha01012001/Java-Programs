package com.example.test;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.example.entity.Student;

public class JPATest {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("pu");
		entityManager = entityMangerFactory.createEntityManager();

		int choice;
		do {
			System.out.println("1. Insert Student record");
			System.out.println("2. View all Student details");
			System.out.println("3. View Student by city name");
			System.out.println("4. Update student details by rollno");
			System.out.println("5. Delete student by rollno");
			System.out.println("6. Search Student on the basis of Percentage");
			System.out.println("7. Display details of 1st Ranker");
			System.out.println("8. Search student details by id");
			System.out.println("9. Sort students by percent");
			System.out.println("10.Display students who are living in the same city");
			System.out.println("0. Exit");
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				insertStudentRecord();
				break;
			case 2:
				viewAllStudentDetails();
				break;
			case 3:
				viewStudentByCityName();
				break;
			case 4:
				updateStudentDetailsByRollNo();
				break;

			case 5:
				deleteStudentByRollNo();
				break;

			case 6:
				System.out.println("Enter min range:");
				double min = scanner.nextDouble();
				System.out.println("Enter max range:");
				double max = scanner.nextDouble();
				searchStudentByPercentage(min,max);
				break;

			case 7:
				displayFirstRanker();
				break;
			case 8:
				searchStudentDetailsById();
				break;

			case 9:
				sortStudentsByPercent();
				break;

			case 10:
				displayStudentsInSameCity();
				break;

			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 10.");
			}
		} while (choice != 10);

		entityManager.close();
		entityManagerFactory.close();
	}

	private static void sortStudentsByPercent() {
		TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s ORDER BY s.percent DESC",
				Student.class);
		List<Student> students = query.getResultList();
		for (Student student : students) {
			System.out.println(student);
		}

	}

	private static void insertStudentRecord() {
		System.out.println("Enter rollNo:");
		int rollNo = scanner.nextInt();
		System.out.println("Enter name:");
		String name = scanner.next();
		System.out.println("Enter dob:");
		String dob = scanner.next();
		System.out.println("Enter percent:");
		double percent = scanner.nextDouble();
		System.out.println("Enter city:");
		String city = scanner.next();
		System.out.println("Enter email_id:");
		String email_id = scanner.next();
		System.out.println("Enter phone_no:");
		String phone_no = scanner.next();

		entityManager.getTransaction().begin();
		Student student = new Student();
		student.setRollNo(rollNo);
		student.setName(name);
		student.setDob(dob);
		student.setPercent(percent);
		student.setCity(city);
		student.setEmail_id(email_id);
		student.setPhone_no(phone_no);
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		System.out.println("      Student record inserted successfully !!!\n");
	}

	private static void viewAllStudentDetails() {
		TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s", Student.class);
		List<Student> students = query.getResultList();
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private static void viewStudentByCityName() {
		System.out.println("Enter city name:");
		String city = scanner.next();
		TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s WHERE s.city = :city",
				Student.class);
		query.setParameter("city", city);
		List<Student> students = query.getResultList();
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private static void updateStudentDetailsByRollNo() {
		System.out.println("Enter rollNo:");
		int rollNo = scanner.nextInt();
		Student student = entityManager.find(Student.class, rollNo);
		if (student != null) {
			System.out.println("Enter new name:");
			student.setName(scanner.next());
			System.out.println("Enter dob : ");
			student.setDob(scanner.next());
			System.out.println("Enter new percent:");
			student.setPercent(scanner.nextDouble());
			System.out.println("Enter city: ");
			student.setCity(scanner.next());
			System.out.println("Enter emai_Id : ");
			student.setEmail_id(scanner.next());
			System.out.println("Enter Phone_No : ");
			student.setPhone_no(scanner.next());

			entityManager.getTransaction().begin();
			entityManager.merge(student);

			entityManager.getTransaction().commit();
			System.out.println("      Student details updated successfully!!!");
		} else {
			System.out.println("Student with rollNo " + rollNo + " Data Not Found ? ");
		}
	}

	private static void deleteStudentByRollNo() {
		System.out.println("Enter rollNo:");
		int rollNo = scanner.nextInt();
		Student student = entityManager.find(Student.class, rollNo);
		if (student != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(student);
			entityManager.getTransaction().commit();
			System.out.println("Student with rollNo " + rollNo + " Deleted Student record successfully !!!\\n.");
		} else {
			System.out.println("Student with rollNo " + rollNo + " record not found.");
		}
	}

	private static void searchStudentByPercentage(double minpercent, double maxpercent) {
		
		TypedQuery<Student> query = entityManager
				.createQuery("SELECT s FROM Student s WHERE s.percent BETWEEN :min AND :max", Student.class);
		query.setParameter("min", minpercent);
		query.setParameter("max", maxpercent);
		List<Student> students = query.getResultList();
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private static void displayFirstRanker() {
		TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s ORDER BY s.percent DESC",
				Student.class);
		query.setMaxResults(1);
		Student firstRanker = query.getSingleResult();
		System.out.println("Details of the 1st Ranker:");
		System.out.println(firstRanker);
	}

	private static void searchStudentDetailsById() {
		System.out.println("Enter student id:");
		int id = scanner.nextInt();
		Student student = entityManager.find(Student.class, id);
		if (student != null) {
			System.out.println(student);
		} else {
			System.out.println("Student with id " + id + " Id not found ?");
		}
	}

	private static void displayStudentsInSameCity() {
		Query query = entityManager.createQuery("SELECT s.city,COUNT(s) FROM Student s GROUP BY s.city");
		List<Object[]> results = query.getResultList();

		for (Object[] result : results) {
			String city = (String) result[0];
			Long count = (Long) result[1];
			if (count > 1) {
				System.out.println("Students living in " + city + ":");
				Query studentQuery = entityManager.createQuery("SELECT s FROM Student s WHERE s.city = :city");
				studentQuery.setParameter("city", city);
				List<Student> students = studentQuery.getResultList();
				for (Student student : students) {
					System.out.println(student);
				}
			}
		}
	}
}
