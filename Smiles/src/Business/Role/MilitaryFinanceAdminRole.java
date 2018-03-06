/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MilitaryFinanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Military.Administartion.MilitaryAdministrationOrganizationAdminRoleWorkAreaJPanel;
import UserInterface.Military.Finance.FinancierRoleWorkAreaJPanel;
import UserInterface.Military.Finance.MilitaryFinanceAdminRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sudeep
 */
public class MilitaryFinanceAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //return new FinancierRoleWorkAreaJPanel(userProcessContainer, account, (MilitaryFinanceOrganization) organization, enterprise,business);
        return new MilitaryFinanceAdminRoleWorkAreaJPanel(userProcessContainer,  account, (MilitaryFinanceOrganization) organization,  enterprise,  business);
        //return null;
    }

     @Override
    public String toString(){
        return RoleType.MilitaryFinanceAdminRole.getValue();
    }
}
