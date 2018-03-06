/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MemberOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.MemberOrganization.MemberOrganizationAdminRoleWorkAreaJPanel;

/**
 *
 * @author Sudeep
 */
public class MemberOrganizationAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MemberOrganizationAdminRoleWorkAreaJPanel(userProcessContainer,  account, (MemberOrganization) organization,  enterprise,  business);
    }
     @Override
    public String toString(){
        return RoleType.MemberOrganizationAdminRole.getValue();
    }
}

