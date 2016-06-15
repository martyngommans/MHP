/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;



import org.dvb.ui.*;


public class Block {
    int value;
    DVBColor color;
    
    boolean added = false;
    
    public Block(int setVal)
    {
        value = setVal;
    }
    
    public DVBColor UpdateColor()
    {
        
        switch(value)
        {
                case 0:
                    color = new DVBColor(180,180,180,255);
                    break;
                case 2:
                    color = new DVBColor(220,220,220,255);
                    break;
                case 4:
                    color = new DVBColor(220,220,120,255);
                    break;
                case 8:
                    color = new DVBColor(250,150,50,255);
                    break;
                case 16:
                    color = new DVBColor(250,110,15,255);
                    break;
                case 2048:
                    color = new DVBColor(100,250,240,255);
                    break;
                default:
                    color = new DVBColor(250,80,10,255);
                    break;
        }
        return color;
    }
    
    public int GetValue()
    {
        return value;
    }
    
    public void SetValue(int valueToSet)
    {
        value = valueToSet;
    }
}
