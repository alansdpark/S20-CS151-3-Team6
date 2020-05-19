package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Audiology;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyGraph;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyGraphView;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyView;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

public class AudiologyGraphController implements Controller {


    public AudiologyGraphController(Audiology audiology, Visit visit, AudiologyGraphView audiologyGraphView,
                                    ClinicController clinicController) {
        this.audiology = audiology;
        this.audiologyGraphView = audiologyGraphView;
        this.clinicController = clinicController;
        this.visit = visit;
        addData();
        initController();
        clinicController.setHeaderContent("Audiology Graph");
    }

    @Override
    public void initController() {
        audiologyGraphView.getBackButton().addActionListener(e -> {
            goToAudiology();
        });
    }

    public void addData(){
        ArrayList<Point> left = createArrayList(audiology.getPureToneLeft());
        ArrayList<Point> right = createArrayList(audiology.getPureToneRight());
        audiologyGraphView.getAudiologyGraph().setLeftEar(left);
        audiologyGraphView.getAudiologyGraph().setRightEar(right);
    }

    public ArrayList<Point> createArrayList(double[] arr){
        ArrayList<Point> pointList = new ArrayList<>();
        pointList.add(new Point(250, (int)arr[0]));
        pointList.add(new Point(500, (int)arr[1]));
        pointList.add(new Point(1000, (int)arr[2]));
        pointList.add(new Point(2500, (int)arr[3]));
        pointList.add(new Point(5000, (int)arr[4]));
        pointList.add(new Point(7500, (int)arr[5]));
        pointList.add(new Point(10000, (int)arr[6]));
        pointList.add(new Point(12000, (int)arr[7]));

        return pointList;
    }

    public void goToAudiology(){
        JFrame frame = clinicController.getFrame();
        frame.remove(audiologyGraphView.getPanel());
        AudiologyView view = new AudiologyView();
        AudiologyController audiologyController =
                new AudiologyController(view, visit, clinicController);
        frame.add(view.getPanel(), BorderLayout.CENTER);
        frame.validate();
        frame.repaint();

    }

    private Audiology audiology;
    private AudiologyGraphView audiologyGraphView;
    private ClinicController clinicController;
    private Visit visit;
}
