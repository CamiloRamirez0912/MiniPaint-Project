package views;

import java.awt.*;

import javax.swing.JFrame;

public class Window extends JFrame{

    private MenuOptions menuOptions ;
    private DrawingBoard drawingBoard;
    private Footer footer;
    private String actualTool;
    private BottomPanel bottomPanel = new BottomPanel();
    GridBagConstraints gbc;


    
    public Window(){
        drawingBoard = new DrawingBoard();
        setLayout(new GridBagLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.CYAN);
        gbc = new GridBagConstraints();

        gbc.gridx = 0;         // Columna 0
        gbc.gridy = 0;         // Fila 0
        gbc.gridwidth = 1;     // Ocupa 1 columna
        gbc.gridheight = 1;    // Ocupa 1 fila
        gbc.weightx = 1.0;     // Ocupa el 100% del ancho
        gbc.weighty = 0.9;     // Ocupa el 90% del alto
        gbc.fill = GridBagConstraints.BOTH; 

        this.add(drawingBoard,gbc);
        menuOptions = new MenuOptions();
        footer = new Footer();

        gbc.gridy = 1;         // Fila 1
        gbc.weighty = 0.1;  

        this.add(bottomPanel, gbc);
        setJMenuBar(menuOptions);
        
    }

    private void setDrawingBoard(){
                                    
    }
}
