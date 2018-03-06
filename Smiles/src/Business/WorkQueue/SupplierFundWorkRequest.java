/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Fund.FundSupplier;

/**
 *
 * @author Sudeep
 */
public class SupplierFundWorkRequest extends WorkRequest{
    private int requestedFund;
    private boolean add;
    private FundSupplier supplier;
    
    public SupplierFundWorkRequest(){
        add = false;
    }
    
    public FundSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(FundSupplier supplier) {
        this.supplier = supplier;
    }

    public int getRequestedFund() {
        return requestedFund;
    }

    public void setRequestedFund(int requestedFund) {
        this.requestedFund = requestedFund;
    }
    

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }
}
