/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public abstract class Organization {
    
    private Type type;
    private String name;
    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 1;
    public HashSet<Role> roles;
    
    public enum Type{
        
        Member("Member Organization"),
        CompanyMember("Company Member Organization"),
        TeamInitiative("Team Initiative Organization"),
        CompanyFinanceOrganization("Company Finance Organization"),
        /*MilitaryHospitalOrganization("Military Hospital Organization"),
        MilitaryHospitalStaffOrganization("Military Hospital Staff Organization"),
        MilitaryAdministrationOrganization("Military Administration Organization"),
        MilitaryStaffOrganization("Military Staff Organization"),
        MilitaryFinanceOrganization("Military Finance Organization"),
        */WelfareOrganization("Welfare Organization"),
        WelfareFundDispenserOrganization("Welfare Fund Dispenser Organization");
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        
        public String toString(){
            return value;
        }
    }

    public Type getOrganizationType() {
        return type;
    }
    
    public Organization(String name) {
        
        this.name = name;
        //this.type = type;
        workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        counter++;
    }

    public abstract HashSet<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
    

    @Override
    public String toString() {
        return name;
    }
}
