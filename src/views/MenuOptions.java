package views;

import java.awt.*;
import javax.swing.*;

public class MenuOptions extends JMenuBar {
    private JMenu menuSettings;
    private JMenu menuTools;
    private JMenu menuAbout;
    private Font customFont;

    public MenuOptions() {
        customFont = new Font("Arial", Font.BOLD, 16);

        menuSettings = new JMenu("Configuración");
        menuSettings.setFont(customFont);
        menuTools = new JMenu("Herramientas");
        menuTools.setFont(customFont);
        menuAbout = new JMenu("Acerca de");
        menuAbout.setFont(customFont);

        this.setPreferredSize(new Dimension(this.getWidth(), 50));
        this.setBorder(BorderFactory.createEmptyBorder());
        this.add(menuTools);
        this.add(menuAbout);
        this.setBackground(new Color(0xE1F0FA));
        setMenuSettings();
    }

    private void setMenuSettings() {
        JMenuItem color = new JMenuItem("Color");
        JMenuItem clean = new JMenuItem("Limpiar");
        JMenuItem exit = new JMenuItem("Salir");

        color.setFont(customFont);
        clean.setFont(customFont);
        exit.setFont(customFont);

        menuSettings.add(color);
        menuSettings.add(clean);
        menuSettings.add(exit);
        this.add(menuSettings);
    }

    private void setMenuTools() {
        JMenuItem linea = new JMenuItem("Linea");
        JMenuItem circulo = new JMenuItem("Circulo");
        JMenuItem rectangulo = new JMenuItem("Rectangulo");

        linea.setFont(customFont);
        circulo.setFont(customFont);
        rectangulo.setFont(customFont);

        menuTools.add(linea);
        menuTools.add(circulo);
        menuTools.add(rectangulo);
    }
}