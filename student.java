package datatypes;

 class student {
	int id;
	String name;
	
	student(int i,String n){
	id=i;
	name=n;
	}
 void display()
 {System.out.println(id+""+name);}
 

	public static void main(String[] args) {
	student s1 = new student(111,"Karan");
	student s2 = new student(222,"aryan");
	s1.display();
	s2.display();
	
		

	}

}
