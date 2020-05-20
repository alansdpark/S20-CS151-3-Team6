package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.controller.NavigationController;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class ClinicController {

    /**
     * Constructor for clinic Controller
     */
    public ClinicController() {
        patientTable = new PatientTable();
        getAllData();
        frame = new JFrame("Clinic Client");
        frame.setMinimumSize(new Dimension(800, 600));
        createHeader();
        NavigationView view = new NavigationView();
        NavigationController controller = new NavigationController(view, this);
        frame.add(view.getPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    /**
     * Constructor for Clinic Controller
     * @param patientTable - patient Table to be loaded
     */
    public ClinicController(PatientTable patientTable) {
        this.patientTable = patientTable;
        frame = new JFrame();
        createHeader();
        NavigationView view = new NavigationView();
        NavigationController controller = new NavigationController(view, this);
        frame.add(view.getPanel(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    /**
     * Creates a JLabel for the header of the Frame
     */
    public void createHeader(){
        header = new JLabel();
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setFont(new Font( "Arial", Font.BOLD, 28));
        frame.add(header, BorderLayout.NORTH);
    }

    /**
     * Sets the header content
     * @param content - content to be added to the header
     */
    public void setHeaderContent(String content){
        header.setText(content);
    }

    /**
     * Serializes the patientTable for later use
     */
    public void saveAllData(){
        String filename = FILE_PATH;

        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(patientTable);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    /**
     * Deserializes the patientTable
     */
    public boolean getAllData(){
        String filename = FILE_PATH;
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            patientTable = (PatientTable)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
            return false;
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
            return false;
        }
        return true;
    }

    /**
     * Getter for patientTable
     *
     * @return patientTable
     */
    public PatientTable getPatientTable() {
        return patientTable;
    }

    /**
     * Setter for patientTable
     *
     * @param patientTable - patientTable
     */
    public void setPatientTable(PatientTable patientTable) {
        this.patientTable = patientTable;
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

    private PatientTable patientTable;
    private JFrame frame;
    private JLabel header;
    private final String FILE_PATH = "./save_data/save.txt";
}

