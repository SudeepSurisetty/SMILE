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
public class State {
    
    private String name;
    private CityDirectory cityDirectory;
    
    public State()
    {
        cityDirectory = new CityDirectory();
        
    }

    public CityDirectory getCityDirectory() {
        return cityDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
