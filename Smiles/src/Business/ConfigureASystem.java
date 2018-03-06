/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Sudeep
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();     
        
        Person person = system.getPersonDirectory().addPerson();
        person.setFirstName("System");
        person.setFirstName("Admin");
        
        String password = "sysadmin";
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", password, person, new SystemAdminRole());
        
        return system;
    }
}
