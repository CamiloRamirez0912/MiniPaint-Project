package views;

import java.awt.*;

import javax.swing.JFrame;

public class Window extends JFrame {
    private MenuOptions menuOptions;
    private DrawingBoard drawingBoard;
    private BottomPanel bottomPanel;
    private String actualTool;
    private Font customFont;

    public Window() {
        customFont = new Font("Arial", Font.BOLD, 16);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);

        menuOptions = new MenuOptions();
        drawingBoard = new DrawingBoard();
        bottomPanel = new BottomPanel();

        setJMenuBar(menuOptions);

        setLayout(new BorderLayout());
        add(drawingBoard, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        bottomPanel.updateColor(Color.BLACK);
        bottomPanel.updateElementCount(0);
    }

    /*private void setDrawingBoard() {

    }*/
}