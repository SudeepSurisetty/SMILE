/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Fund;

/**
 *
 * @author Sudeep
 */
public class Fund {
    
    private String fundName;
    private int fundId;
    private String fundCause;    
    private static int count;
    private int fund;

    public Fund() {
        
        fundId = ++count;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundCause() {
        return fundCause;
    }

    public void setFundCause(String fundCause) {
        this.fundCause = fundCause;
    }

    public int getFund() {
        return fund;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }

   

    public int getFundId() {
        return fundId;
    }
    
     @Override
    public String toString(){
    return fundName;
    }
}

