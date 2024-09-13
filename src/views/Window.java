package views;

import java.awt.*;
import javax.swing.JFrame;

public class Window extends JFrame {

        private VerticalMenuPanel verticalMenu;
        private DrawingBoard drawingBoard;
        private BottomPanel bottomPanel;

        public Window() {
                setExtendedState(JFrame.MAXIMIZED_BOTH);
                setLayout(new BorderLayout());
                getContentPane().setBackground(Color.CYAN);

                verticalMenu = new VerticalMenuPanel();
                drawingBoard = new DrawingBoard();
                bottomPanel = new BottomPanel();

                add(verticalMenu, BorderLayout.WEST);
                add(drawingBoard, BorderLayout.CENTER);
                add(bottomPanel, BorderLayout.SOUTH);
        }
}