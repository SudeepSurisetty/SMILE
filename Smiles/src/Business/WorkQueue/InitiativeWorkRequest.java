/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

//import Business.UserAccount.UserAccount;
//import Business.UserAccount.UserAccountDirectory;
//import java.util.ArrayList;
import java.util.Date;


public class InitiativeWorkRequest extends WorkRequest {
        
     //private String eventType;
//     private UserAccountDirectory participatingUsers;
     private String shrtDescription;
     private String lngDescription;
     private int nbrOfPeopleRequired;
     private Date validityDate;
     private int nbrOfParticipants;
     private String fundStatus;

//    public InitiativeWorkRequest() {
//        participatingUsers=new UserAccountDirectory();
//    }

    public String getShrtDescription() {
        return shrtDescription;
    }

//    public UserAccountDirectory getParticipatingUsers() {
//        return participatingUsers;
//    }
//
//    public void setParticipatingUsers(UserAccountDirectory participatingUsers) {
//        this.participatingUsers = participatingUsers;
//    }

    public void setShrtDescription(String shrtDescription) {
        this.shrtDescription = shrtDescription;
    }

    public String getLngDescription() {
        return lngDescription;
    }

    public void setLngDescription(String lngDescription) {
        this.lngDescription = lngDescription;
    }

    public int getNbrOfPeopleRequired() {
        return nbrOfPeopleRequired;
    }

    public void setNbrOfPeopleRequired(int nbrOfPeopleRequired) {
        this.nbrOfPeopleRequired = nbrOfPeopleRequired;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }

    public int getNbrOfParticipants() {
        return nbrOfParticipants;
    }

    public void setNbrOfParticipants(int nbrOfParticipants) {
        this.nbrOfParticipants = nbrOfParticipants;
    }

    public String getFundStatus() {
        return fundStatus;
    }

    public void setFundStatus(String fundStatus) {
        this.fundStatus = fundStatus;
    }
     
    
    
    @Override
    public String toString(){
        return shrtDescription;
    }
    
}
