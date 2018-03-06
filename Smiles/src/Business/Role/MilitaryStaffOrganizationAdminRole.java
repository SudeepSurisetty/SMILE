/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Military.Staff.MilitaryStaffOrganizationAdminRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Home
 */
public class MilitaryStaffOrganizationAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MilitaryStaffOrganizationAdminRoleWorkAreaJPanel(userProcessContainer, enterprise);
        //return null;
    }

     @Override
    public String toString(){
        return Role.RoleType.MilitaryStaffAdminRole.getValue();
    }

}
