/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.internalframesamples;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class InternalFrameMenuBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        JDesktopPane desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);
        //create menubar
        //add menuitem
        //create new internalframe when the item is clicked
        
        JMenuBar jMenuBar=new JMenuBar();
        frame.setJMenuBar(jMenuBar); 
        JMenu menu=new JMenu("Edit");
        jMenuBar.add(menu); //menu放到menuBar
        JMenuItem item =new JMenuItem("Add");
        menu.add(item); //item加到menu
        item.addActionListener(new ActionListener(){ //若按下按鈕
            @Override
            public void actionPerformed(ActionEvent e){
                JInternalFrame jInternalFrame = new JInternalFrame();
                frame.add(jInternalFrame); //把internal放desjtop pane
                jInternalFrame.setSize(300,300);
                jInternalFrame.setVisible(true);
                jInternalFrame.setMaximizable(true);
                jInternalFrame.setIconifiable(true);  //放大縮小
                jInternalFrame.setResizable(true);//可以自訂大小
                jInternalFrame.setClosable(true); //可關閉視窗
                jInternalFrame.setLocation(desktopPane.getAllFrames().length*10,desktopPane.getAllFrames().length*10); //視窗不重疊
            }
        });
        
        ////////////////////////////
        frame.setVisible(true);
    }

}
