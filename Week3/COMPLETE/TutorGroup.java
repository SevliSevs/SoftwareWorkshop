package week3;

import java.util.ArrayList;

public class TutorGroup {
	
	private String tutor;
	private ArrayList<Student> students;
	
	public TutorGroup(String tutor)
	{
		this.tutor = tutor;
		this.students = new ArrayList<Student>();
	}
	
	public String toString()
	{
		return "Tutor: " + this.tutor + ", Students: " + this.students;
	}
	
	public String getTutor()
	{
		return this.tutor;
	}
	
	public void setTutor(String tutor)
	{
		this.tutor = tutor;
	}
	
	public void addStudent(Student student)
	{
		(this.students).add(student);
	}
	
	public ArrayList<Student> getStudents()
	{
		return this.students;
	}

}
