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
