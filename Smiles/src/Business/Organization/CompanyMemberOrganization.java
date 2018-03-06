/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CompanyMemberRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author JAI
 */
public class CompanyMemberOrganization extends Organization {

    public CompanyMemberOrganization(){
        super(Type.CompanyMember.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new CompanyMemberRole());
        return roles;
    }
    
}
