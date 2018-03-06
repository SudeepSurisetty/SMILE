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
import UserInterface.MemberOrganization.Member.MemberRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sudeep
 */
public class OfficerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       // return new OfficerRoleWorkAreaJPanel(userProcessContainer,(MilitaryAdministrationOrganizationAdminRole) organization, account,enterprise,business);
        return null;
    }
    
    @Override
    public String toString(){
        return RoleType.OfficerRole.getValue();
    }
}
