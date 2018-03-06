/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Fund.FundDirectory;
import Business.Network.City;
import Business.Network.Network;
import Business.Network.State;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.CompanyAdminRole;
import Business.Role.MilitaryAdminRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Sudeep
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private FundDirectory fundList;
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        //System.out.println("======> " + business);
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        fundList = new FundDirectory();
//        business = getInstance();
    }

    public FundDirectory getFundList() {
        System.out.println("Inside fundlist");
        return fundList;
    }

    public void setFundList(FundDirectory fundList) {
        this.fundList = fundList;
    }

    
    
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        HashSet<Role> roleList = new HashSet<>();
        roleList.add(new SystemAdminRole());
        roleList.add(new AdminRole());
        roleList.add(new CompanyAdminRole());
        roleList.add(new MilitaryAdminRole());
        
        return roleList;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

        /*if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }*/System.out.println("method entered");
        System.out.println(getInstance().getNetworkList());
        for (Network network : getInstance().getNetworkList()) {
            System.out.println("Entering network");
            for (State state : network.getStateDirectory().getStateList()) {
                for (City city : state.getCityDirectory().getCityList()) {
                    for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                        for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                            if (ua.getUsername().equals(username)) {
                                return false;
                            }
                        }

                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                                if (ua.getUsername().equals(username)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
