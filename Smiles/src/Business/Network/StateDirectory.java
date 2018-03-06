/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Sudeep
 */
public class StateDirectory {
    
    
    private ArrayList<State> stateList;
    
    public StateDirectory(){
        stateList = new ArrayList<State>();
    }

    public ArrayList<State> getStateList() {
        return stateList;
    }
    
    public State addState()
    {
        State s = new State();
        stateList.add(s);
        return s;
        
    }
    
    
}
