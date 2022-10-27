package org.col;
import org.staff.Staff;
import org.stu.Student;
public class College {
	public void collegeName() {
		System.out.println("SRM University");
	}
	public static void main(String[]args) {
		College c = new College();
		Student s = new Student();
		Staff f = new Staff();
		
		c.collegeName();
		s.StudentId();
		s.StudentName();
		s.StudentDept();
		f.StaffId();
		f.StaffDept();
	}
	
	
	
	
	

}
