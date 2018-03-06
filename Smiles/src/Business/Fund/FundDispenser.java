/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Fund;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Sudeep
 */
public class FundDispenser {
    
    private String fundDispenserName;
    private static int count = 1;
    private int id;
    private FundDirectory fundList;
    private WorkQueue workQueue;
    private float totalAmt = 0;
    
    public FundDispenser(){
        id= count;
        ++count;
        fundList= new FundDirectory();
        workQueue= new WorkQueue();
    }

    public String getFundDispenserName() {
        return fundDispenserName;
    }

    public void setFundDispenserName(String fundDispenserName) {
        this.fundDispenserName = fundDispenserName;
    }

    public FundDirectory getFundList() {
        return fundList;
    }

    public void setFundList(FundDirectory fundList) {
        this.fundList = fundList;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getId() {
        return id;
    }

    public float getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(float totalAmt) {
        this.totalAmt = totalAmt;
    }
    
    
    
    @Override
    public String toString(){
        return fundDispenserName;
    }
    
    
}
