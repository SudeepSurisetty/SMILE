/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Sudeep
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        //Using switch instead of if else statements
        /*if (null != type)switch (type) {
            case Individual:
                enterprise = new IndividualEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Company:
                enterprise = new CompanyEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Military:
                enterprise = new MilitaryEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Philanthropist:
                enterprise = new PhilanthropistEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
        */
        
        
        if (type == Enterprise.EnterpriseType.Individual){
            enterprise = new IndividualEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.Company){
            enterprise = new CompanyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.Philanthropist){
            enterprise = new PhilanthropistEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
