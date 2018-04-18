
package weed;
import becker.robots.icons.Icon;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Tile  extends Icon
{
   private String icon;
   public Tile(String icon) {
    this.icon = icon;
   }
    
  public void paintIcon(Graphics g)
  {
    try
    {
      BufferedImage bi = ImageIO.read(new File(this.icon));
      g.drawImage(bi, 15, 15, 85, 85, 0, 0, 256, 256, null);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
