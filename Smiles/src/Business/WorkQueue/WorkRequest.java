/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Fund.Fund;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.Date;

/**
 *
 * @author Sudeep
 */
public class WorkRequest {
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String type;
    private String requestType;
    boolean participate = false;
    boolean complete = false;
    boolean delete = false;
    private UserAccountDirectory participatingUsers;
    
    private Fund fund;
    
    private int requestedFund; //adding from fundworkrequest
    private boolean add;
    
    public WorkRequest()
    {
        participatingUsers=new UserAccountDirectory();
        requestDate = new Date();
        add = false;
    }

    public UserAccountDirectory getParticipatingUsers() {
        return participatingUsers;
    }

    public void setParticipatingUsers(UserAccountDirectory participatingUsers) {
        this.participatingUsers = participatingUsers;
    }
    
    
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    
    
    
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    public boolean isComplete() {
        return complete;
    }

    public boolean isParticipate() {
        return participate;
    }

    public void setParticipate(boolean participate) {
        this.participate = participate;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void changeCompleteStatus(boolean flag){
        this.complete = flag;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }
    
    public Fund getFund() {
        return fund;
    }

    public void setFund(Fund fund) {
        this.fund = fund;
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
    
    
    
    @Override
    public String toString(){
        return status;
    }
}
