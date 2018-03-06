/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author sowjanya
 */
public class IndividualWorkRequest extends WorkRequest {
       

     private String shrtDescription;
     private String lngDescription;
     private Date validityDate;

   

//    public String getHelptype() {
//        return helptype;
//    }
//
//    public void setHelptype(String helptype) {
//        this.helptype = helptype;
//    }

    public String getShrtDescription() {
        return shrtDescription;
    }

    public void setShrtDescription(String shrtDescription) {
        this.shrtDescription = shrtDescription;
    }

    public String getLngDescription() {
        return lngDescription;
    }

    public void setLngDescription(String lngDescription) {
        this.lngDescription = lngDescription;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }
        
        
     @Override
    public String toString(){
        return shrtDescription;
    }
    

    
}
