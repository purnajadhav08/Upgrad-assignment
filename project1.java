import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Project1 {
	 int t1;
	 String name;
	 double cgpa;

	public Project1 (int token, String fname, double cgpa) {
		this.t1 = t1;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int gett1() {
		return t1;
	}

	public String getname() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

}

class Events {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
		
		
	PriorityQueue<Student> pQ = new PriorityQueue<Student>();
	
				
	new Comparator<Student>() {
					
    public int compare(Student student1, Student student2) {//comparing previous student with next 
				
			
	if (student1.getCgpa() != student2.getCgpa()){//condition1:checking highest cgpa
						
	if(student1.getCgpa() > student2.getCgpa())
	return -1;
	else
	return 1;						
	}else {
	if (  ( student1.getname().compareTo(student2.getname()) ) != 0){//condition2:checking firstname if cgpa is same
	return student1.getname().compareTo(student2.getname());
	}else
    return student1.gett1(); - student2.gett1(); //condition3:checking token if both are same.
						}
					}				
	            }
	
		
					
			
				
	for (int i = 0; i < n; i++) {
	String event = in.next();
    if (event.equals("ENTER")) {
    String name = in.next();
    double cgpa = in.nextDouble();
    int t1 = in.nextInt();
                
    Student student = new Student(token, name, cgpa);
                
     pQ.add(student);
     } else if (event.equals("SERVED")) {
     pQ.poll();//poll()method returns null when queue is empty
            }
		}
		
     if ( pQ.isEmpty() ) {
			System.out.println("EMPTY");
		} else {
			for (;;) {//for infinite loop
				Student stu = PQ.poll();

				try {
					System.out.println(stu.getname());
				} catch (NullPointerException  e) {
				
					break;
				}
			}
		}
	}
}


