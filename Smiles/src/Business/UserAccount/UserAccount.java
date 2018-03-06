/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.InitiativeWorkQueue;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Sudeep
 */
public class UserAccount {
    
    private String username;
    private String password;
    //private int password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private InitiativeWorkQueue initiativeWorkQueue;
    private int smile=0;
    private String secretAnswer1;
    private String secretAnswer2;
    private String secretQuestion1;
    private String secretQuestion2;
    private float totalAmt = 0; 
    
    public UserAccount() {
        workQueue = new WorkQueue();
        initiativeWorkQueue=new InitiativeWorkQueue();
    }

    public int getSmile() {
        return smile;
    }

    public void setSmile(int smile) {
        this.smile = smile;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public InitiativeWorkQueue getInitiativeWorkQueue() {
        return initiativeWorkQueue;
    }

    public void setInitiativeWorkQueue(InitiativeWorkQueue initiativeWorkQueue) {
        this.initiativeWorkQueue = initiativeWorkQueue;
    }

    public String getSecretAnswer1() {
        return secretAnswer1;
    }

    public void setSecretAnswer1(String secretAnswer1) {
        this.secretAnswer1 = secretAnswer1;
    }

    public String getSecretAnswer2() {
        return secretAnswer2;
    }

    public void setSecretAnswer2(String secretAnswer2) {
        this.secretAnswer2 = secretAnswer2;
    }

    public String getSecretQuestion1() {
        return secretQuestion1;
    }

    public void setSecretQuestion1(String secretQuestion1) {
        this.secretQuestion1 = secretQuestion1;
    }

    public String getSecretQuestion2() {
        return secretQuestion2;
    }

    public void setSecretQuestion2(String secretQuestion2) {
        this.secretQuestion2 = secretQuestion2;
    }

    public float getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(float totalAmt) {
        this.totalAmt = totalAmt;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
}
