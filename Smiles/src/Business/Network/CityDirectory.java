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
public class CityDirectory {
    
    private ArrayList<City> cityList;
    
    public CityDirectory(){
        cityList = new ArrayList<>();
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }
    
        
    public City addCity()
    {
        City c = new City();
        cityList.add(c);
        return c;
        
    }
}
