/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import WeatherStation.WeatherStation;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Christoph Mautner
 */
public class CellRenderer implements TableCellRenderer
{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component c=null;
        JLabel label = new JLabel();
        WeatherStation ws = (WeatherStation)value;
        if(jtable.getColumnCount()==3)
        {
            switch(jtable.convertColumnIndexToModel(column))
            {
                case 0: label.setText(ws.getPlace());
                break;
                case 1: label.setText(String.format("%.1f°", ws.getTemp()));
                break;
                case 2: label.setText(""+ws.getHumidity()+"%");
                break;
                default: label.setText("???");
                break;
            }
        }
        else if(jtable.getColumnCount()==4)
        {
            switch(jtable.convertColumnIndexToModel(column))
            {
                case 0: label.setText(ws.getPlace());
                break;
                case 1: label.setText(ws.getSealevel()+"m");
                break;
                case 2: label.setText(String.format("%.1f°", ws.getTemp()));
                break;
                case 3: label.setText(""+ws.getHumidity()+"%");
                break;
                default: label.setText("???");
                break;
            }
        }
        c = label;
        return c;
    }
    
}
