/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author JAI
 */
public class InitiativeWorkQueue {
    
    
    private ArrayList<InitiativeWorkRequest> initiativeWorkRequestList;

    public InitiativeWorkQueue() {
        initiativeWorkRequestList = new ArrayList<>();
    }

    public ArrayList<InitiativeWorkRequest> getWorkRequestList() {
        return initiativeWorkRequestList;
    }
    
    
    public void removeRequest(InitiativeWorkRequest initiativeWorkRequest){
        initiativeWorkRequestList.remove(initiativeWorkRequest);
    }
    
}
