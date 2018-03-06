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
public class Network {
 
    private String name;
    //private CountryDirectory countryDirectory;
    private StateDirectory stateDirectory;
    
    
    public Network()
    {
       //countryDirectory = new CountryDirectory();
       stateDirectory = new StateDirectory();
        
    }

    /*
    public CountryDirectory getCountryDirectory() {
        return countryDirectory;
    }*/

    public StateDirectory getStateDirectory() {
        return stateDirectory;
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
