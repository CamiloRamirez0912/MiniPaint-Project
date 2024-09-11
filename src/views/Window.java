package views;

import java.awt.*;

import javax.swing.JFrame;

public class Window extends JFrame{

    private MenuOptions menuOptions ;
    private DrawingBoard drawingBoard;
    private Footer footer;
    private String actualTool;


    
    public Window(){
        drawingBoard = new DrawingBoard();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.CYAN);
        menuOptions = new MenuOptions();
        footer = new Footer();
        this.add(footer);
        setJMenuBar(menuOptions);
        this.add(drawingBoard);
    }

    private void setDrawingBoard(){
                                    
    }
}
