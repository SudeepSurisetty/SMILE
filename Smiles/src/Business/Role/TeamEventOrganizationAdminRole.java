/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TeamInitiativeOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.TeamInitiative.TeamEventAdminRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sudeep
 */
public class TeamEventOrganizationAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TeamEventAdminRoleWorkAreaJPanel(userProcessContainer,  account, (TeamInitiativeOrganization) organization,  enterprise,  business);
    }
     @Override
    public String toString(){
        return RoleType.TeamEventOrganizationAdminRole.getValue();
    }
}
