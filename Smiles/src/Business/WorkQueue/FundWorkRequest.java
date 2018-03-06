/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Sudeep
 */
public class FundWorkRequest extends WorkRequest{
    private int requestedFund;
    private boolean add;
    
    public FundWorkRequest(){
        add = false;
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
