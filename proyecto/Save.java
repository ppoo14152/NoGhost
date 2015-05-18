import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.UserInfo;
/**
 * Write a description of class Save here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Save  
{
    // instance variables - replace the example below with your own
    private UserInfo player;

    /**
     * Constructor for objects of class Save
     */
    public Save()
    {
        if ((UserInfo.isStorageAvailable()) && (UserInfo.getMyInfo() != null)) {
          this.player = UserInfo.getMyInfo();
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void saveHighscore(int score)
  {
      if ((UserInfo.isStorageAvailable()) && (this.player != null) && ((score > this.player.getScore()) || (this.player.getInt(0) == 0)))
      {
          this.player.setScore(score);
          this.player.setInt(0, 1);
          this.player.store();
        }
        
      if ((UserInfo.isStorageAvailable()) && (this.player != null) && (score > this.player.getScore()))
      {
          this.player.setScore(score);
          this.player.setInt(0, 1);
          this.player.store();
      }
    }
}
