package edu.sjsu.cs.tinnitus.tests;

import java.awt.Frame;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;

import org.junit.Before;
import org.junit.Test;

import edu.sjsu.cs.tinnitus.controller.ClinicController;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyGraph;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyGraphView;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyView;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;
import edu.sjsu.cs.tinnitus.view.frames.MedicalHistoryView;
import edu.sjsu.cs.tinnitus.view.frames.MedicationView;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;
import edu.sjsu.cs.tinnitus.view.frames.PatientListView;
import edu.sjsu.cs.tinnitus.view.frames.PatientView;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;

public class OverallTest
{
	ClinicController cc;
	
	/**
	 * Constructor for all tests.
	 */
	@Before
	public void initTests()
	{
		cc = new ClinicController();
	}
	
	/**
	 * Tests the audiology graph.
	 */
	@Test
	public void testAudiologyGraph()
	{
		double[] db = {40, 20, 12, 32, 50 , 20, 80, 9};
        ArrayList<Point> pointList = new ArrayList<>();
        pointList.add(new Point(1000, 25));
        pointList.add(new Point(2000, 50));
        pointList.add(new Point(3000, 80));
        pointList.add(new Point(4000, 100));
        pointList.add(new Point(5000, 30));
        pointList.add(new Point(6000, 10));
        pointList.add(new Point(7000, 30));
        pointList.add(new Point(8000, 36));


        ArrayList<Point> pointList2 = new ArrayList<>();
        pointList2.add(new Point(1200, 25));
        pointList2.add(new Point(2200, 50));
        pointList2.add(new Point(2300, 70));
        pointList2.add(new Point(3400, 110));
        pointList2.add(new Point(4500, 43));
        pointList2.add(new Point(5600, 51));
        pointList2.add(new Point(6700, 60));
        pointList2.add(new Point(7800, 66));


        AudiologyGraph agv = new AudiologyGraph();
        agv.setLeftEar(pointList);
        agv.setRightEar(pointList2);

        cc.getFrame().setContentPane(agv);
        assert(cc.getFrame().getContentPane() == agv); // Checks to see if set to correct content pane.
        
        for (int i = 0; i < agv.getLeftEar().size(); i++)
        {
        	assert(agv.getLeftEar().get(i) == pointList.get(i)); // Checks whether same points on panel as added.
        }
        
        for (int i = 0; i < agv.getRightEar().size(); i++)
        {
        	assert(agv.getRightEar().get(i) == pointList2.get(i)); // Checks whether same points on panel as added.
        }
	}
	
	/**
	 * Tests audiology view.
	 */
	@Test
	public void testAudiology()
	{
		AudiologyView av = new AudiologyView();
		cc.getFrame().setContentPane(av.getPanel());
		assert(cc.getFrame().getContentPane() == av.getPanel()); // Checks to see if set to correct content pane.
	}
	
	/**
	 * Tests whether JUnit tests are working. SHOULD BE FALSE!!
	 */
	@Test
	public void testFalse()
	{
		assert(cc.getFrame().isVisible() == false);
	}
	
	/**
	 * Checks whether Clinic Controller is visible.
	 */
	@Test
	public void testClinicController()
	{
		assert(cc.getFrame().isVisible() == true);
	}
	
	/**
	 * Tests login view.
	 */
	@Test
	public void testLogIn()
	{
		LogInView liv = new LogInView();
		cc.getFrame().setContentPane(liv.getPanel());
		assert(cc.getFrame().getContentPane() == liv.getPanel());
	}
	
	/**
	 * Tests Medical History.
	 */
	@Test
	public void testMedicalHistory()
	{
		MedicalHistoryView mhv = new MedicalHistoryView();
		cc.getFrame().setContentPane(mhv.getPanel());
		assert (cc.getFrame().getContentPane() == mhv.getPanel());
	}
	
	@Test
	public void testMedication()
	{
		MedicationView mv = new MedicationView();
		cc.getFrame().setContentPane(mv);
		assert(cc.getFrame().getContentPane() == mv);
	}
	
	@Test
	public void testNavigation()
	{
		NavigationView nv = new NavigationView();
		cc.getFrame().setContentPane(nv.getPanel());
		assert(cc.getFrame().getContentPane() == nv.getPanel());
	}
	
	@Test
	public void testPatientList()
	{
		PatientListView plv = new PatientListView();
		cc.getFrame().setContentPane(plv.getPanel());
		assert(cc.getFrame().getContentPane() == plv.getPanel());
	}
	
	@Test
	public void testPatient()
	{
		PatientView pv = new PatientView();
		cc.getFrame().setContentPane(pv.getPanel());
		assert(cc.getFrame().getContentPane() == pv.getPanel());
	}
	
	@Test
	public void testRegister()
	{
		RegisterPatientView rpv = new RegisterPatientView();
		cc.getFrame().setContentPane(rpv.getPanel());
		assert(cc.getFrame().getContentPane() == rpv.getPanel());
	}
	
	@Test
	public void testVisits()
	{
		VisitView vv = new VisitView();
		cc.getFrame().setContentPane(vv.getPanel());
		assert(cc.getFrame().getContentPane() == vv.getPanel());
	}
}
