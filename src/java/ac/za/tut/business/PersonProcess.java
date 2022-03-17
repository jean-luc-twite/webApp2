/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.business;

/**
 *
 * @author HP
 */
public class PersonProcess {
    private Person person;

    public PersonProcess(Person person) {
        this.person = person;
    }
    public String determineTitle(){
        String title = "Ms";
        
        if(Character.toUpperCase(person.getGender().charAt(0)) == 'M'){
            title = "Mr";
        }
        return title;
    }
    public String determineAge(){
        String[] token = person.getDob().split("/");
        Integer birthyear = Integer.parseInt(token[2]);
        
        Integer  age = 2022 - birthyear;
          
        return age.toString();
    }
}
