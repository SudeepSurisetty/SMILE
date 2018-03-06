/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Credentials;

import java.util.ArrayList;

/**
 *
 * @author sowjanya
 */
public class CredentialsList {
    private ArrayList<Credentials> credentialList;
    
    public CredentialsList(){
        credentialList = new ArrayList<Credentials>();
        
    }

    public ArrayList<Credentials> getCredentialList() {
        return credentialList;
    }

    public void setCredentialList(ArrayList<Credentials> credentialList) {
        this.credentialList = credentialList;
    }
    
    
   public Credentials addCredential(){
        
        Credentials cred = new Credentials();
        credentialList.add(cred);
        return cred;      
        
    }
    
    
    
}
