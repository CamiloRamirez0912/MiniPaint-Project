package views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window extends JFrame {

        private MenuOptions menuOptions;
        private VerticalMenu verticalMenu;
        private DrawingBoard drawingBoard;
        private BottomPanel bottomPanel = new BottomPanel();
        private GridBagConstraints gbc;
        private String stateMenuTools;
        private JMenuItem changeMenuItem;
        private JButton changeMenuButton;
        private JButton changeSideButton;
        private String menuSide = "Left";

        public Window() {
                stateMenuTools = "Left";
                drawingBoard = new DrawingBoard();
                setLayout(new GridBagLayout());
                setExtendedState(JFrame.MAXIMIZED_BOTH);
                getContentPane().setBackground(Color.CYAN);
                changeMenuItem = new JMenuItem("Cambiar Menu Vertical");
                changeMenuButton = new JButton("Cambiar Menu Vertical");
                changeSideButton = new JButton("Cambiar de Lado");
                eventChangeMenu();
                menuOptions = new MenuOptions(changeMenuItem);
                gbc = new GridBagConstraints();
                setMenuSide();
                eventChangeVertical();
                eventChangeSide();

        }

        public void setMenuTop() {
                gbc.gridx = 0; // Columna 0
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.gridheight = 1;
                gbc.weightx = 1.0;
                gbc.weighty = 0.9;
                gbc.fill = GridBagConstraints.BOTH;
                this.add(drawingBoard, gbc);
        }

        private void setMenuSide() {
                verticalMenu = new VerticalMenu();
                changeSideButton.setMaximumSize(
                                new Dimension(Integer.MAX_VALUE, changeSideButton.getMinimumSize().height));
                changeSideButton.setFont(new Font("Arial", Font.PLAIN, 14));

                changeMenuButton.setMaximumSize(
                                new Dimension(Integer.MAX_VALUE, changeMenuButton.getMinimumSize().height));
                changeMenuButton.setFont(new Font("Arial", Font.PLAIN, 14));
                verticalMenu.add(changeMenuButton);
                verticalMenu.add(changeSideButton);
                if (menuSide.equals("Right")) {
                        positionLayoutRight();
                } else {
                        positionLayoutLeft();
                }
                this.add(drawingBoard, gbc);
                setBottomPanelHorizontal();
        }

        private void positionLayoutLeft() {
                gbc.gridx = 0; // Columna 0 (izquierda)
                gbc.gridy = 0; // Fila 0
                gbc.gridwidth = 1; // Ocupa 1 columna
                gbc.gridheight = 1; // Ocupa 1 fila (todo el alto)
                gbc.weightx = 0.2; // Ocupa el 20% del ancho
                gbc.weighty = 0.9; // Ocupa el 100% del alto
                gbc.fill = GridBagConstraints.BOTH;
                this.add(verticalMenu, gbc);

                gbc.gridx = 1; // Columna 1 (a la derecha del menú)
                gbc.gridy = 0; // Fila 0 (misma fila que el menú)
                gbc.gridwidth = 1; // Ocupa 1 columna
                gbc.gridheight = 1; // Ocupa 1 fila (todo el alto)
                gbc.weightx = 0.8; // Ocupa el 80% del ancho
                gbc.weighty = 0.9; // Ocupa el 100% del alto
                gbc.fill = GridBagConstraints.BOTH;
        }

        private void positionLayoutRight() {
                gbc.gridx = 1; // Columna 1 (derecha)
                gbc.gridy = 0; // Fila 0
                gbc.gridwidth = 1; // Ocupa 1 columna
                gbc.gridheight = 1; // Ocupa 1 fila (todo el alto)
                gbc.weightx = 0.2; // Ocupa el 20% del ancho
                gbc.weighty = 0.9; // Ocupa el 100% del alto
                gbc.fill = GridBagConstraints.BOTH; // Se expande tanto en ancho como en alto
                this.add(verticalMenu, gbc);

                gbc.gridx = 0; // Columna 1 (a la izquierda del menú)
                gbc.gridy = 0; // Fila 0 (misma fila que el menú)
                gbc.gridwidth = 1; // Ocupa 1 columna
                gbc.gridheight = 1; // Ocupa 1 fila (todo el alto)
                gbc.weightx = 0.8; // Ocupa el 80% del ancho
                gbc.weighty = 0.9; // Ocupa el 100% del alto
                gbc.fill = GridBagConstraints.BOTH;
        }

        private void setBottomPanel() {
                gbc.gridy = 1;
                gbc.gridx = 0;
                gbc.weighty = 0.01;
                gbc.weightx = 1;
                gbc.fill = GridBagConstraints.BOTH;
                this.add(bottomPanel, gbc);
        }

        public void setBottomPanelHorizontal() {
                gbc.gridx = 0; // Columna 0 (izquierda)
                gbc.gridy = 1; // Fila 0
                gbc.gridwidth = 2; // Ocupa 2 columna
                gbc.gridheight = 1; // Ocupa 1 fila (todo el alto)
                gbc.weightx = 1.0; // Ocupa el 20% del ancho
                gbc.weighty = 0; // Ocupa el 100% del alto
                gbc.fill = GridBagConstraints.BOTH;
                this.add(bottomPanel, gbc);
        }

        private void eventChangeMenu() {
                changeMenuItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                eventChangeMenuPosition();
                        }
                });
        }

        private void eventChangeSide() {
                changeSideButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                if (menuSide.equals("Left")) {
                                        remove(verticalMenu);
                                        menuSide = "Right";
                                        setMenuSide();
                                } else {
                                        remove(verticalMenu);
                                        menuSide = "Left";
                                        setMenuSide();
                                }
                                revalidate();
                                repaint();
                        }
                });
        }

        private void eventChangeVertical() {
                changeMenuButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                eventChangeMenuPosition();
                        }
                });
        }

        private void eventChangeMenuPosition() {
                if (stateMenuTools.equals("Top")) {

                        setJMenuBar(null);
                        setMenuSide();
                        setBottomPanelHorizontal();
                        stateMenuTools = "Left";

                } else {
                        if (stateMenuTools.equals("Left") || stateMenuTools.equals("Right")) {
                                setBottomPanel();
                                setJMenuBar(menuOptions);
                                stateMenuTools = "Top";
                                setMenuTop();
                                remove(verticalMenu);
                        }
                }
                revalidate();
                repaint();
        }
}