/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CompanyMemberOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CompanyMemberOrganization.CompanyMember.CompanyMemberRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author JAI
 */
public class CompanyMemberRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CompanyMemberRoleWorkAreaJPanel(userProcessContainer,(CompanyMemberOrganization) organization, account,enterprise,business);
    }
    
    @Override
    public String toString(){
        return RoleType.CompanyMemberRole.getValue();
    }
}
