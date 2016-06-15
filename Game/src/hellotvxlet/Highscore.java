/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

/**
 *
 * @author student
 */
public class Highscore {
    public int[] arrHighscore = new int[10];
    public int[] arrTemp = new int[10];

   public void ReadHighscore()
   {
    for(int i = 0; i < arrHighscore.length; i++)
    {
        arrHighscore[i] = 0;
    }
   }
   
   public void WriteHighscore(int points)
    {

    }
    
    public void SaveHighscore(int points)
    {
        if(points > arrHighscore[arrHighscore.length-1])
        {
        int element = 0;
        for(int i = arrHighscore.length-1; i >= 0; i--)
        {
            if(points > arrHighscore[i])
            {
                element = i;
            }            
        }
        
        for(int i = 0; i < arrHighscore.length; i++)
        {
              if(i < element)
              {
                  arrTemp[i] = arrHighscore[i];
              }
              else if (i == element)
              {
                  arrTemp[i] = points;
              }
              else
              {
                  if(i+1 < arrHighscore.length)
                  {
                  arrTemp[i] = arrHighscore[i-1];
                  }
              }
             
        }
        
        for(int i = 0; i < arrHighscore.length; i++)
        {
            arrHighscore[i] = arrTemp[i];
        }
      }

    }
    
    public void LoadHighscore(int points)
    {

    }
}
