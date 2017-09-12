import java.util.Date;

/**
 * Class that stores information about the concrete student
 * 
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 * 
 */
public class Student implements Comparable {
void getDetails(int n)
{
	int i;
	Scanner get=new Scanner(system.in);
	int limit=n;
	system.out.println("enter +limit+ Student \n");
	for(int i=0;i<limit;i++)
	{
	  system.out.println("enter student #" +(i+1)+" Name, rollno, marks");
	  for(int i=0;i<limit;i++)
		{
		  name[i][j]=get.nextLine();
		}
	}
          display limit;	
	 }
	  void display(int limit)
	 {
	  	  system.out.println("student name"+"\t"+rollno"+"\t"+marks");
		  for(int i=0;i<limit;i++)
		{
		  for(int j=0;j<3;j++)
			{
			  system.out.println(name[i][j]+"\t\t");
			}
			  system.out.println();
		}
	}
}
class BVRIT
{
	public static void main(String args[args])throws IOException
	{
	  Scanner s=new Scanner(system.in);
	  system.out.println("enter the total number of students in the class:");
	  for(int i=0;i<n;i++)
	  {
	   for(j=0;j<n;j++)
	   {
	  Student a=new Student();
	  a.name="Sonu";
	  a.grade="59.64";
	  a.roll no="14211a0533";
	  a.gender="female";
	  system.out.println("student name"+\n"student grade"+\n"student roll no"+\n"student gender");
	 /**
	 * student id
	 */
	private int id;

	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String fullName;

	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;

	/**
	 * student average mark
	 */
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
