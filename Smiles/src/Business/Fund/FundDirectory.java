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
public class FundDirectory {
    
    private ArrayList<Fund> fundList;

    public FundDirectory() {
        fundList = new ArrayList<Fund>();
    }

    public ArrayList<Fund> getFundList() {
        return fundList;
    }

    public void setFundList(ArrayList<Fund> fundList) {
        this.fundList = fundList;
    }
    
    public Fund addFund(){
        Fund f = new Fund();
        fundList.add(f);
        return f;
    }
    
    public void removeFund(Fund f){
        fundList.remove(f);
    }
}
