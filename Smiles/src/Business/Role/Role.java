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
import javax.swing.JPanel;

/**
 *
 * @author Sudeep
 */
public abstract class Role {

    public enum RoleType {

        AdminRole("Admin Role"), // Individual Enterprise Admin
        CompanyAdminRole("Company Admin Role"), // Company Enterprise Admin
        MilitaryAdminRole("Military Admin Role"), // Military Enterprise Admin
        PhilanthropistAdminRole("Philanthropist Admin Role"), // Philanthropist Enterprise Admin
         
        MemberOrganizationAdminRole("Member Admin Role"), // Member Organization Admin
        TeamEventOrganizationAdminRole("Team Event Admin Role"), // TeamEvent Initiative Organization Admin
        CompanyFinanceOrganizationAdminRole("Company Finance Organization Admin Role"), //Company Finance Organization Admin Role
        MilitaryHospitalAdminRole("Military Hospital Admin Role"), // Military Hospital Organization Admin
        MilitaryHospitalStaffAdminRole("Hospital Staff Admin Role"), //Military Hospital Staff Organization Admin
        MilitaryAdministrationAdminRole("Military Administration Admin Role"), //Military Administration Organization Admin
        MilitaryStaffAdminRole("Staff Admin Role"), //Military Staff Organization Admin
        MilitaryFinanceAdminRole("Military Finance Admin Role"), //Military Finance Organization
        FundDispenserRole("Fund Dispenser Role"),//Welfare Fund Dispenser Organization
        FundSupplierRole("Fund Supplier Role"),//Welfare Organization
        
        
        
        MemberRole("Member"), // Member Role        
        EventCreatorRole("Event Creator Role"),  //Event Creator Role
        CompanyMemberRole("Company Member Role"),
        CompanyMemberOrganizationAdmin("Company Member Organization Admin Role"),// Company Member Role
        CompanyFinancierRole("Company Financier Role"), //Company Financier Role
        DoctorRole("Doctor"), //Military Hospital Doctor Role
        HospitalStaffRole("Hospital Staff Role"), //Hospital Staff Role
        OfficerRole("Officer Role"), //Officer Role
        OfficeStaffRole("Office Staff Role"), //Ofice Staff Role
        FinancierRole("Financier Role"); //Financier Role
        
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }

    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
