import java.util.*;
public class customexcep {
    public static void main(String args[]){
        SubjectMarksEntry sme = new SubjectMarksEntry();
        try{
            sme.insertMarks();
        }
        catch(MarksOutofBoundssException e){
            System.out.println(e);
        }
        
    }
}

class SubjectMarksEntry {
    public void insertMarks() throws MarksOutofBoundssException
    {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter subject marks");
        marks = sc.nextInt();
        if(marks > 80)
            throw new MarksOutofBoundssException();
        else
            System.out.println("Marks" +marks);
        
    }
}
class MarksOutofBoundssException extends Exception {
    

   
    
        
}
