/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abc
 */
import java.util.*;
public class UserException {
    public static void main(String args[]){
        SubjectMarksEntry sme = new SubjectMarksEntry();
        try{
            sme.insertMarks();
        }
        catch(MarksOutofBoundsException e){
            System.out.println(e.tooString());
        }
        System.out.println("Statement of the exception");
    }
}

class SubjectMarksEntry {
    public void insertMarks() throws MarksOutofBoundsException
    {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter subject marks");
        marks = sc.nextInt();
        if(marks > 80)
            throw new MarksOutofBoundsException(marks);
        else
            System.out.println("Marks" +marks);
        
    }
}
class MarksOutofBoundsException extends Exception {
    int marks;
    public MarksOutofBoundsException(int m){
        marks = m;
    }
    public String tooString(){
        return "marks out of bound as" + marks + ">80";
    }

   
    
        
}
