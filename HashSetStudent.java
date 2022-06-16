package com.cashapona.collection.jun13;

import java.util.HashSet;
import java.util.Iterator;

class Student{
private String Name;
private int Id;
private int RollNo;
private String StudentAddress;
private String StudentCollegeAddress;
private String BranchName;
private String FatherName;
private long PhoneNumber;
public Student(String name, int id, int rollNo, String studentAddress, String studentCollegeAddress, String branchName,
		String fatherName, long phoneNumber) {
	Name = name;
	Id = id;
	RollNo = rollNo;
	StudentAddress = studentAddress;
	StudentCollegeAddress = studentCollegeAddress;
	BranchName = branchName;
	FatherName = fatherName;
	PhoneNumber = phoneNumber;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public int getRollNo() {
	return RollNo;
}
public void setRollNo(int rollNo) {
	RollNo = rollNo;
}
public String getStudentAddress() {
	return StudentAddress;
}
public void setStudentAddress(String studentAddress) {
	StudentAddress = studentAddress;
}
public String getStudentCollegeAddress() {
	return StudentCollegeAddress;
}
public void setStudentCollegeAddress(String studentCollegeAddress) {
	StudentCollegeAddress = studentCollegeAddress;
}
public String getBranchName() {
	return BranchName;
}
public void setBranchName(String branchName) {
	BranchName = branchName;
}
public String getFatherName() {
	return FatherName;
}
public void setFatherName(String fatherName) {
	FatherName = fatherName;
}
public long getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	PhoneNumber = phoneNumber;
}
@Override
public String toString() {
	return "Student [Name=" + Name + ", Id=" + Id + ", RollNo=" + RollNo + ", StudentAddress=" + StudentAddress
			+ ", StudentCollegeAddress=" + StudentCollegeAddress + ", BranchName=" + BranchName + ", FatherName="
			+ FatherName + ", PhoneNumber=" + PhoneNumber + "]";
}
}
public  class HashSetStudent{
	public static void main(String[]args) {
		HashSet<Student>s1=new HashSet<Student>();
		//creating students 
		Student s2=new Student("venkat",1,223,"Hyderabad","varam","civil","ram",123456);
		Student s3=new Student("venkat",2,227,"Hyderabad","varam","civil","sam",183457);
		Student s4=new Student("venkat",3,224,"Hyderabad","varam","civil","tej",23458);
		Student s5=new Student("venkat",4,225,"Hyderabad","varam","civil","ram",123459);
		Student s6=new Student("venkat",5,226,"Hyderabad","varam","civil","ven",444444444);
		Student s7=new Student("venkat",6,227,"Hyderabad","varam","civil","naveen",817984156);
		Student s8=new Student("venkat",7,228,"Hyderabad","varam","civil","ram",123452);
		Student s9=new Student("venkat",8,229,"Hyderabad","varam","civil","ravi",88879797);
		
//Adding Student to s1
		s1.add(s2);
		s1.add(s3);
		s1.add(s4);
		s1.add(s5);
		s1.add(s6);
		s1.add(s7);
		s1.add(s8);
		s1.add(s9);
		s1.add(null);// HasSet will Accept only one null value  
		s1.add(null);
		for(Student s:s1) {
		System.out.println(s);
		}
	     boolean da=s1.remove(s9);
		System.out.println(da);
		
		System.out.println("ofter removing the s9 object values ");	
	Iterator<Student> it=s1.iterator();
	while(it.hasNext()) {	
		System.out.println(it.next());
	}
	}
}

















