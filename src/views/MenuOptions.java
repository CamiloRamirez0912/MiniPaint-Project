package views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuOptions extends JMenuBar{
    private JMenu menuSettings;
    private JMenu menuTools;
    private JButton buttonAbout;
    private Font font;
    
    public MenuOptions(){
        menuSettings = new JMenu("Configuración");
        menuTools = new JMenu("Herramientas");
        buttonAbout = new JButton("AAcerca de");
        font = new Font("Arial", Font.BOLD, 16);
        this.setPreferredSize(new Dimension(this.getWidth(), 50));
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setBackground(new Color(0xE1F0FA));
        setMenuSettings();
        setMenuTools();
        setButtonAbout();
    }

    private void setMenuSettings(){
        JMenuItem color = new JMenuItem("Color");
        JMenuItem clean = new JMenuItem("Limpiar");
        JMenuItem exit = new JMenuItem("Salir");
        menuSettings.setFont(font);
        menuSettings.add(color);
        menuSettings.add(clean);
        menuSettings.add(exit);
        this.add(menuSettings);
    }

    private void setMenuTools(){
        JMenuItem color = new JMenuItem("Linea");
        JMenuItem clean = new JMenuItem("Circulo");
        JMenuItem exit = new JMenuItem("Rectangulo");
        menuTools.setFont(font);
        menuTools.add(color);
        menuTools.add(clean);
        menuTools.add(exit);
        this.add(menuTools);
    }


    private void setButtonAbout() {
        // Crear un JButton en lugar de JMenu
        buttonAbout = new JButton("Acerca de");
        buttonAbout.setFont(font);

        buttonAbout.setBorderPainted(false);

        buttonAbout.setContentAreaFilled(false);
        buttonAbout.setFocusPainted(false);

        buttonAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a ejecutar cuando se hace clic en el JButton
                JOptionPane.showMessageDialog(null, "MINIPAINT\n 1\n Taller 1 Programación II\n Diego && Camilo \n 10/09/2024");
            }
        });

        // Agregar el JButton al JMenuBar
        this.add(buttonAbout);
    }


}
