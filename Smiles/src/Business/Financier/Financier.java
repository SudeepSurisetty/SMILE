/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Financier;

import Business.Fund.FundDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Sudeep
 */
public class Financier {
    
    private FundDirectory fundList;
    private String financierName;
    private static int count = 1;
    private int id;
    private WorkQueue workQueue;

    public Financier(){
        id= count;
        ++count;
        fundList= new FundDirectory();
        workQueue= new WorkQueue();
    }

    public FundDirectory getFundList() {
        return fundList;
    }

    public void setFundList(FundDirectory fundList) {
        this.fundList = fundList;
    }

    public String getFinancierName() {
        return financierName;
    }

    public void setFinancierName(String financierName) {
        this.financierName = financierName;
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
    
    
    @Override
    public String toString(){
        return financierName;
    }
}
