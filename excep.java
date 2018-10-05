/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author abc
 */
public class excep {
    static void demoproc(){
        try{
            throw new NullPointerException("dem");
        } catch(NullPointerException e){
            System.out.println("caught inside demoproc");
            throw e;
            
        }
    }
    
    public static void main(String args[]){
        try{
            demoproc();
            
        }catch(NullPointerException e){
            System.out.println("recught" +e);
        }
    }
    
    
}
