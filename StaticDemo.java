// A java program to demonstrate use of 
// static keyword with methods and variables 
  
// Student class 
class Student  
{ 
    String name; 
    int rollNo; 
      
    // static variable 
    static String cllgName; 
      
    // static counter to set unique roll no 
    static int counter = 0; 
      
      
    public Student(String name)  
    { 
        this.name = name; 
          
        this.rollNo = setRollNo(); 
    } 
      
    // getting unique rollNo 
    // through static variable(counter) 
    static int setRollNo() 
    { 
        counter++; 
        return counter; 
    } 
      
    // static method 
    static void setCllg(String name){ 
        cllgName = name ; 
    } 
      
    // instance method 
    void getStudentInfo(){ 
        System.out.println("name : " + this.name); 
        System.out.println("rollNo : " + this.rollNo); 
          
        // accessing static variable 
        System.out.println("cllgName : " + cllgName); 
    } 
} 
  
//Driver class 
public class StaticDemo  
{ 
    public static void main(String[] args) 
    { 
        // calling static method 
        // without instantiating Student class 
        Student.setCllg("XYZ"); 
      
        Student s1 = new Student("Alice"); 
        Student s2 = new Student("Bob"); 
          
        s1.getStudentInfo(); 
        s2.getStudentInfo(); 
          
    } 
}
