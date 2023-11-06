public class Student extends Person{
    String name = "ABC";
    String course = "CSE";
    
    Student(){
        super();
        System.out.println("Name is "+name);
        System.out.println("Course is "+course);
    }
    
    
    public void display(){
        super.display();
        
    }
    
}