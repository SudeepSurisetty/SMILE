/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalStaffRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class MilitaryHospitalStaffOrganization extends Organization {
    
    public MilitaryHospitalStaffOrganization(){
        //super(Type.MilitaryHospitalStaffOrganization.getValue());
        super(null);
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new HospitalStaffRole());
        return roles;
    }
}
