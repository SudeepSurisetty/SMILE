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
import UserInterface.Company.TeamInitiative.EventCreator.EventCreatorWorkAreaJPanel;
//import UserInterface.TeamInitiative.EventCreator.EventCreatorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sudeep
 */
public class EventCreatorRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EventCreatorWorkAreaJPanel(userProcessContainer,(TeamInitiativeOrganization) organization, account,enterprise,business);
        //return null;
    }
    
    @Override
    public String toString(){
        return RoleType.EventCreatorRole.getValue();
    }
}
