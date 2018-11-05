/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherStation;

/**
 *
 * @author Christoph Mautner
 */
public class WeatherStation
{
    private String place;
    private int sealevel;
    private float temp;
    private int humidity;

    public WeatherStation(String place, int sealevel, float temp, int humidity) throws Exception
    {
        this.place = place;
        this.sealevel = sealevel;
        try{
            setTemp(temp);
            setHumidity(humidity);
        }catch(Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }

    public void setTemp(float temp) throws Exception
    {
        if(temp<(-35)||temp>45)
        {
            throw new Exception("Falsche Temperatur");
        }
        this.temp = temp;
    }

    public int getHumidity()
    {
        return humidity;
    }

    public void setHumidity(int humidity) throws Exception
    {
        if(humidity<0||humidity>100)
        {
            throw new Exception("Falsche Humidity");
        }
        this.humidity = humidity;
    }

    public String getPlace()
    {
        return place;
    }

    public int getSealevel()
    {
        return sealevel;
    }

    public float getTemp()
    {
        return temp;
    }
    
    
    
}
