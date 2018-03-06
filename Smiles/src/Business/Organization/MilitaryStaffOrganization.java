/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OfficeStaffRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class MilitaryStaffOrganization extends Organization {
    
    public MilitaryStaffOrganization(){
        super(null);
   //     super(Type.MilitaryStaffOrganization.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new OfficeStaffRole());
        return roles;
    }
}
