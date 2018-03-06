/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Fund;

import java.util.ArrayList;

/**
 *
 * @author Sudeep
 */
public class FundSupplierDirectory {
    
    private ArrayList<FundSupplier> fundSupplierList;

    public FundSupplierDirectory() {
        fundSupplierList = new ArrayList<>();
    }

    public ArrayList<FundSupplier> getFundSupplierList() {
        return fundSupplierList;
    }

    public void setFundSupplierList(ArrayList<FundSupplier> fundSupplierList) {
        this.fundSupplierList = fundSupplierList;
    }
    
    
    public FundSupplier addFundSupplier(){
        FundSupplier f = new FundSupplier();
        fundSupplierList.add(f);
        return f;
        
    }
    
    public void removeFundSupplier(FundSupplier fs){
        fundSupplierList.remove(fs);
    }
}
