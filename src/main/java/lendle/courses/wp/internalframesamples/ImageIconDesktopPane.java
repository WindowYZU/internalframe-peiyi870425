/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.internalframesamples;

import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author lendle
 */
public class ImageIconDesktopPane extends JDesktopPane{
    private Image image=null;

    public ImageIconDesktopPane() {
        try {
            ImageIcon icon = new ImageIcon(new URL(
                    "https://image.freepik.com/free-vector/blue-and-green-wavy-background_1035-7430.jpg"));
            image=icon.getImage();
        } catch (MalformedURLException ex) {
            Logger.getLogger(ImageIconDesktopPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //override paintComponent to draw scaled image
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if (this.getWidth()<image.getWidth(this) || this.getHeight()<image.getHeight(this)){
            g.drawImage(image, 0, 0 , this);
        }
        else{
            g.drawImage(image, this.getWidth()/2 - image.getWidth(this)/2, this.getHeight()/2 - image.getHeight(this)/2, this);
        }
        } //
    ///////////////////////////////////////////////
    
}
