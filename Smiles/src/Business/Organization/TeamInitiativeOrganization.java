/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventCreatorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class TeamInitiativeOrganization extends Organization{
    
    public TeamInitiativeOrganization() {
        super(Organization.Type.TeamInitiative.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new EventCreatorRole() );
        return roles;
        //return null;
    }
}
