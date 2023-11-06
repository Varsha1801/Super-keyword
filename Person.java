public class Person{
    String city = "Bangalore";
    int uniqueId = 12345;
    
    
    Person(){
        System.out.println("Unique id is "+uniqueId);
    }
    
    public void display(){
        System.out.println("Unique id is "+uniqueId);
        System.out.println("City is "+city);
        
    }
}