package week3;

public class Test
{
	public static void main(String[] args)
	{
	
		Module sw = new Module("Software Workshop", "Jon Rowe");
		
		/*System.out.println(sw);
		
		System.out.println(sw.getName());
		System.out.println(sw.getLecturer());
		
		System.out.println("changing lecturer");*/
		sw.setLecturer("Martin Escardo");
		
		//System.out.println(sw);
		
		Student alf = new Student("Alfred Smith", 12345);
		
		/*System.out.println(alf);
		System.out.println(alf.getName());
		System.out.println(alf.getId());*/
		
		//System.out.println("changing id");
		alf.setId(54321);
		//System.out.println(alf);
		
		alf.setModule(0, sw);
		alf.setModule(1, new Module("Foundations", "Dan Ghica"));
		alf.setModule(2, new Module("Intro to AI", "Volker Sorge"));
		
		/*System.out.println(alf.getModule(1));
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(alf.getModule(i));
		}*/
		
		//QUESTION1 TEST
		System.out.println("\nQ1 test 1- should be T:   " + sw.equals(sw));
		System.out.println("Q1 test 2- should be T:   " + sw.equals(new Module ("Software Workshop", "me :)")));
		System.out.println("Q1 test 3- should be F:   " + sw.equals(new Module ("Pizza Making", "Dominos")));
		
		//QUESTION2 TEST
		System.out.println("\nQ2 test 1- should be T:   " + alf.onModule(sw));
		System.out.println("Q2 test 2- should be F:   " + alf.onModule(new Module ("who knows", "me")));
		
		//QUESTION3 TEST
		TutorGroup tut = new TutorGroup("John Bullinaria");
		System.out.println("\nQ3 test 1:   " + tut.toString());
		tut.setTutor("Beyonce Knowles");
		System.out.println("Q3 test 2:   " + tut.getTutor());
		tut.addStudent(alf);
		tut.addStudent(new Student ("Alice Pilgrim", 1466089));
		System.out.println("Q3 test 3:   " + tut.getStudents());
		System.out.println("Q3 test 4:   " + tut.toString());
		
		
	}
}