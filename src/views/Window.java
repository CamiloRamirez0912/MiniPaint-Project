package views;

import java.awt.*;

import javax.swing.JFrame;

public class Window extends JFrame{

    private MenuOptions menuOptions ;
    DrawingBoard drawingBoard = new DrawingBoard();
    private String actualTool;

    
    public Window(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.CYAN);
        menuOptions = new MenuOptions();
        setJMenuBar(menuOptions);
        add(drawingBoard);
    }

    private void setDrawingBoard(){
        
    }
}
