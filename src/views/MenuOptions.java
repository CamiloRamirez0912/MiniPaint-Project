package views;

import java.awt.*;

import javax.swing.*;

public class MenuOptions extends JMenuBar{
    private JMenu menuSettings;
    private JMenu menuTools;
    private JMenu menuAbout;
    
    public MenuOptions(){
        menuSettings = new JMenu("Configuración");
        menuTools = new JMenu("Herramientas");
        menuAbout = new JMenu("Acerca de");
        this.setPreferredSize(new Dimension(this.getWidth(), 50));
        this.setBorder(BorderFactory.createEmptyBorder());
        this.add(menuTools);
        this.add(menuAbout);
        this.setBackground(new Color(0xE1F0FA));
        setMenuSettings();
    }

    private void setMenuSettings(){
        JMenuItem color = new JMenuItem("Color");
        JMenuItem clean = new JMenuItem("Limpiar");
        JMenuItem exit = new JMenuItem("Salir");
        menuSettings.add(color);
        menuSettings.add(clean);
        menuSettings.add(exit);
        this.add(menuSettings);
    }

    private void setMenuTools(){
        JMenuItem color = new JMenuItem("Linea");
        JMenuItem clean = new JMenuItem("Circulo");
        JMenuItem exit = new JMenuItem("Rectangulo");
        menuSettings.add(color);
        menuSettings.add(clean);
        menuSettings.add(exit);
        this.add(menuSettings);
    }


}
