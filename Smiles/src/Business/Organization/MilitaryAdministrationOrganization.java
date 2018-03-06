/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OfficerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class MilitaryAdministrationOrganization extends Organization {
    
    public MilitaryAdministrationOrganization(){
        //super(Type.MilitaryAdministrationOrganization.getValue());
        super(null);
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new OfficerRole());
        return roles;
    }
}
