/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import WeatherStation.WeatherStation;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Christoph Mautner
 */
public class TabelModel extends AbstractTableModel
{
    private ArrayList<WeatherStation> stations = new ArrayList<WeatherStation>();
    private String[] colnames = {};
    
    public void add(WeatherStation ws)
    {
        stations.add(ws);
        fireTableDataChanged();
    }
    
    public void updateColumns(int numColumns)
    {
        colnames = new String[numColumns];
        if(numColumns==4)
        {
                colnames[0]="Place";
                colnames[1]="SeaLevel";
                colnames[2]="Temperatur";
                colnames[3]= "Humidity";
        }
        else if(numColumns==3)
        {
                colnames[0]="Place";
                colnames[1]="Temperatur";
                colnames[2]= "Humidity";
        }
        else
        {
            colnames[0]="???";
        }
    }
    @Override
    public String getColumnName(int column)
    {
        return colnames[column];
    }
    
    @Override
    public int getRowCount()
    {
        return stations.size();
    }

    @Override
    public int getColumnCount()
    {
        return colnames.length;
    }

    @Override
    public Object getValueAt(int row, int column)
    {
        return stations.get(row);
    }
    
}
