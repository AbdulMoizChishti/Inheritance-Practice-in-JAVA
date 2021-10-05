/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceinjava;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class Person {
    
  public String name;int age; String add;
   
   public void data(){
   }
}


class A extends Person{

    
    public void data(int age){
     name = "Moiz";
        System.out.println(age);
     String name1="";
    }
    
    
}

class B extends Person{

}