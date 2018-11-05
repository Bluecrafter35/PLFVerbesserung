/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherStation;

import java.util.Comparator;

/**
 *
 * @author Christoph Mautner
 */
public class Sortieren implements Comparator<WeatherStation>
{

    @Override
    public int compare(WeatherStation t, WeatherStation t1)
    {
        return t.getPlace().compareTo(t1.getPlace());
    }


    
}
