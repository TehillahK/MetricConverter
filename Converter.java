import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter {
    private JTextField valueTextBox;
    private JButton convertBtn;
    private JButton cancelBtn;
    private JPanel panel;

    public static void main(String[] args)
    {
        Converter app=new Converter();
        app.screen();
    }
    public Converter()
    {
        panel=new JPanel();
    }
    private double calculate(double valueConv)
    {
        return valueConv * 0.621371;
    }
    private void screen()
    {
        createWindow();

    }
    private void createWindow()
    {
        final int WINODW_WIDTH=350;
        final int WINDOW_HEIGHT=250;
        //create window
        JFrame window   =   new JFrame();
        //set title
        window.setTitle("Converter");
        //set the size  of the window
        window.setSize(WINODW_WIDTH,WINDOW_HEIGHT);
        createPannel();
        window.add(panel);
        window.setVisible(true);
    }
    private void createPannel()
    {
        valueTextBox=new JTextField(10);
        convertBtn=new JButton("convert");
        convertBtn.addActionListener(new convertBtnListner());
        panel=new JPanel();
        panel.add(valueTextBox);
        panel.add(convertBtn);
       // panel.add(cancelBtn);
    }
    private class convertBtnListner implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

            String input;
            input=valueTextBox.getText();
            JOptionPane.showMessageDialog(null,input+"in km is"+calculate(Double.parseDouble(input))+"miles.");
        }
    }
}
