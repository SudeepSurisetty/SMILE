/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Role.MilitaryAdministrationOrganizationAdminRole;
import Business.Role.MilitaryFinanceAdminRole;
import Business.Role.MilitaryHospitalOrganizationAdminRole;
import Business.Role.MilitaryHospitalStaffOrganizationAdminRole;
import Business.Role.MilitaryStaffOrganizationAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class MilitaryEnterprise extends Enterprise{
    
    public MilitaryEnterprise(String name) {
        //super(name, Enterprise.EnterpriseType.Military);
        super(name,null);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new MilitaryAdministrationOrganizationAdminRole());
        roles.add(new MilitaryStaffOrganizationAdminRole());
        roles.add(new MilitaryHospitalOrganizationAdminRole());
        roles.add(new MilitaryHospitalStaffOrganizationAdminRole());
        roles.add(new MilitaryFinanceAdminRole());
        return roles;
    }
}
