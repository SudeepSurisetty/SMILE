/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Fund.FundSupplierDirectory;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class WelfareOrganization extends Organization {
    
    private FundSupplierDirectory supplierList;
    
    public WelfareOrganization() {
        super(Organization.Type.WelfareOrganization.getValue());
        supplierList= new FundSupplierDirectory();
    }

    public FundSupplierDirectory getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(FundSupplierDirectory supplierList) {
        this.supplierList = supplierList;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
     
   /*
    public WelfareOrganization(){
        super(Type.WelfareOrganization.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new FundSupplierRole());
        return roles;
    }*/
}
