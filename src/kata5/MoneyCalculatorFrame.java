package kata5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MoneyCalculatorFrame extends JFrame {

    public MoneyCalculatorFrame() {
        
        setTitle("MoneyCalculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300,300));
        createComponents();
        setVisible(true);
    }

    private void createComponents() {
        add(createExchangeDialog());
        add(createToolbar(),BorderLayout.SOUTH);
    }

    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel(new FlowLayout());
        return panel;
    }

    private JPanel createToolbar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
