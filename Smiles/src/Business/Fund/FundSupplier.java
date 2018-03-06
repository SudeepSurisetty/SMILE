/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Fund;

import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Sudeep
 */
public class FundSupplier {
    
    private String fundSupplierName;
    private static int count;
    private int id;
    private FundDirectory fundList;
    private WorkQueue workQueue;
    private float totalAmt = 0;
    //private int[] moneyInstances;
    //private ArrayList<Integer> moneyInstance;
    
    public FundSupplier(){
        id= ++count;
        fundList= new FundDirectory();
        workQueue= new WorkQueue();
      //  moneyInstances = new int[25];
      //  moneyInstance = new ArrayList<>();
    }

    public String getFundSupplierName() {
        return fundSupplierName;
    }

    public void setFundSupplierName(String fundSupplierName) {
        this.fundSupplierName = fundSupplierName;
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

    /*
    public ArrayList<Integer> getMoneyInstance() {
        return moneyInstance;
    }

    public void setMoneyInstance(ArrayList<Integer> moneyInstance) {
        this.moneyInstance = moneyInstance;
    }

    
    
    public int addMoneyInstance(int money){
        ArrayList<Integer> a1 = new ArrayList<>();
        //System.out.println(money);
        //int a= money;
        //System.out.println(moneyInstance);
        a1.add(money);
        System.out.println(a1);
        moneyInstance.append(a1);
        //moneyInstance.add(a);
        return money;
    }
    */
    
    
    @Override
    public String toString(){
        return fundSupplierName;
    }
}
