package edu.sjsu.cs.tinnitus.view.frames.util;

import javax.swing.*;
import java.util.ArrayList;

public class AlertBox {

    public AlertBox(ArrayList<String> message) {
        this.message = message;
        initComponents();
        addComponents();
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }

    public void initComponents(){
        frame = new JFrame();
        closeButton = new JButton("Continue");

        closeButton.addActionListener(e ->{
            frame.dispose();
        });
    }

    public void addComponents(){
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        for(String mes : message){
            frame.add(new JLabel(mes));
        }
        frame.add(closeButton);
    }


    /**
     * Getter for frame
     *
     * @return frame
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Setter for frame
     *
     * @param frame - frame
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    /**
     * Getter for closeButton
     *
     * @return closeButton
     */
    public JButton getCloseButton() {
        return closeButton;
    }

    /**
     * Setter for closeButton
     *
     * @param closeButton - closeButton
     */
    public void setCloseButton(JButton closeButton) {
        this.closeButton = closeButton;
    }

    /**
     * Getter for message
     *
     * @return message
     */
    public ArrayList<String> getMessage() {
        return message;
    }

    /**
     * Setter for message
     *
     * @param message - message
     */
    public void setMessage(ArrayList<String> message) {
        this.message = message;
    }

    private JFrame frame;
    private JButton closeButton;
    private ArrayList<String> message;
}
