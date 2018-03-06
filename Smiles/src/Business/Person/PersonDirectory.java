/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Sudeep
 */
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory()
    {
        personDirectory = new ArrayList<>();
        
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }
    
    public Person addPerson()
    {
        Person p = new Person();
        personDirectory.add(p);
        return p;
        
    }
}
