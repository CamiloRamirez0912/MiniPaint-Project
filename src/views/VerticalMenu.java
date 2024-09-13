package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerticalMenu extends JToolBar {

    private JButton button1;
    private JButton button2;
    private JPopupMenu menuSettings;
    private JMenuItem submenu;

    public VerticalMenu() {
        button1 = new JButton("Nuevo menu");
        this.setOrientation(JToolBar.VERTICAL);
        menuSettings = new JPopupMenu("Settings");
        submenu = new JMenuItem("Seting 1");
        menuSettings.add(submenu);
        this.add(menuSettings);
        this.add(button1);

        setBackground(Color.CYAN);
        actionEvent();
    }

    public void actionEvent(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                menuSettings.show(submenu, submenu.getWidth() / 2, submenu.getHeight()/2);
                revalidate();
                repaint();
            }
        });
    }
}