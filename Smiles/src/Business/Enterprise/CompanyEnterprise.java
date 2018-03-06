/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CompanyFinanceOrganizationAdminRole;
import Business.Role.TeamEventOrganizationAdminRole;
import Business.Role.MemberOrganizationAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class CompanyEnterprise extends Enterprise{
    
    public CompanyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Company);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new MemberOrganizationAdminRole());
        roles.add(new TeamEventOrganizationAdminRole());
        roles.add(new CompanyFinanceOrganizationAdminRole());
        return roles;
    }
    
}
