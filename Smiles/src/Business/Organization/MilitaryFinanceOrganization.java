/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Financier.Financier;
import Business.Role.FinancierRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class MilitaryFinanceOrganization extends Organization{
    Financier f;
    
    public MilitaryFinanceOrganization(){
        //super(Organization.Type.MilitaryFinanceOrganization.getValue());
        super(null);
        f = new Financier();
    }

    public Financier getF() {
        return f;
    }

    public void setF(Financier f) {
        this.f = f;
    }
    
    
    
    @Override
    public HashSet<Role> getSupportedRole() {
        //return null;
        roles= new HashSet<>();
        roles.add(new FinancierRole());
        return roles;
    }
}
