package views;

import java.awt.*;

import javax.swing.JFrame;

public class Window extends JFrame {

    private MenuOptions menuOptions;
    private DrawingBoard drawingBoard;
    private String actualTool;
    private BottomPanel bottomPanel = new BottomPanel();
    GridBagConstraints gbc;

    public Window() {
        drawingBoard = new DrawingBoard();
        setLayout(new GridBagLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.CYAN);
        gbc = new GridBagConstraints();

        gbc.gridx = 0; // Columna 0
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.9;
        gbc.fill = GridBagConstraints.BOTH;

        this.add(drawingBoard, gbc);
        menuOptions = new MenuOptions();
<<<<<<< HEAD
        gbc.gridy = 1; // Fila 1
        gbc.weighty = 0.01;
=======
        gbc.gridy = 1;         // Fila 1
        gbc.weighty = 0.01;  
>>>>>>> Diego
        this.add(bottomPanel, gbc);
        setJMenuBar(menuOptions);

    }

}