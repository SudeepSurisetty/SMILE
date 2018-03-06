/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Fund.FundDispenser;
import Business.Role.FundDispenserRole;
import Business.Role.OfficerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class WelfareFundDispenserOrganization extends Organization {
    
    FundDispenser dispenser;
      public WelfareFundDispenserOrganization() {
        super(Organization.Type.WelfareFundDispenserOrganization.getValue());
        dispenser = new FundDispenser();
    }

    public FundDispenser getDispenser() {
        return dispenser;
    }

    public void setDispenser(FundDispenser dispenser) {
        this.dispenser = dispenser;
    }

    
      
      
    @Override
    public HashSet<Role> getSupportedRole() {
        
        return null;
    }
    
    
    
    /*public WelfareFundDispenserOrganization(){
        super(Type.WelfareFundDispenserOrganization.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new FundDispenserRole());
        return roles;
    }*/
}
