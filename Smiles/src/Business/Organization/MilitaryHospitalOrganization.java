/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class MilitaryHospitalOrganization extends Organization {
    
    public MilitaryHospitalOrganization(){
       // super(Type.MilitaryHospitalOrganization.getValue());
       super(null);
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new DoctorRole());
        return roles;
    }
}
