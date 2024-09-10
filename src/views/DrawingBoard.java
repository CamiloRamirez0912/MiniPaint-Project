package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawingBoard extends JPanel {
    // Lista para almacenar grupos de puntos
    private ArrayList<ArrayList<Point>> pointGroups;
    private ArrayList<Point> currentGroup; // Grupo de puntos actual
    private float lineThickness = 5.0f;
    private Color customColor;

    public DrawingBoard() {
        pointGroups = new ArrayList<>();
        currentGroup = new ArrayList<>();
        customColor = new Color(0xF7F7F7);
        setBackground(customColor);
        addEvents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; // Convertir Graphics a Graphics2D
        g2.setColor(Color.BLACK);

        // Establecer el grosor de la línea
        g2.setStroke(new BasicStroke(lineThickness));

        // Dibujar cada grupo de puntos
        for (ArrayList<Point> group : pointGroups) {
            for (int i = 1; i < group.size(); i++) {
                Point p1 = group.get(i - 1);
                Point p2 = group.get(i);
                g2.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }
    }

    private void createGroupPoints(){
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                // Crear un nuevo grupo de puntos al presionar el mouse
                currentGroup = new ArrayList<>();
                pointGroups.add(currentGroup);
                currentGroup.add(e.getPoint());
                repaint();
            }
        });
    }

    private void paintEvent(){
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                // Agregar puntos al grupo actual mientras se arrastra el mouse
                currentGroup.add(e.getPoint());
                repaint();
            }
        });
    }

    private void addEvents(){
        createGroupPoints();
        paintEvent();
    }

}

