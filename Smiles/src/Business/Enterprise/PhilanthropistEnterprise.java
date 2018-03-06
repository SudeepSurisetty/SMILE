/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Role.FundDispenserRole;
import Business.Role.FundSupplierRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class PhilanthropistEnterprise extends Enterprise{
    
     
    public PhilanthropistEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Philanthropist);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new FundDispenserRole());
        roles.add(new FundSupplierRole());
        
        return roles;
    }
}
