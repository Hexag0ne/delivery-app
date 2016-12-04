package com.hexagone.delivery.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.hexagone.delivery.control.UserActions;

public class MainFrame extends JFrame {

	/** Controller of this instance of MainFrame */
	UserActions controller;
	
	/** JPanel containing all the elements in the frame */
	private JPanel allPanel;
	/** JPanel containing the top row of buttons */
	private JPanel headerPanel;
	
	private JButton loadMapButton;
	private JButton loadDeliveryButton;
	private JButton computeTourButton;
	private JButton generatePlanning;
	
	/**
	 * Constructor for the main frame
	 * @param controller the controller implementing the UserActions to be performed when an event occurs
	 */
	public MainFrame(UserActions controller)
	{
		this.controller = controller;
		
		
		this.setTitle("Delivery App");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(screenSize.width, screenSize.height-50);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		allPanel = new JPanel();
		allPanel.setLayout(new BorderLayout());


		// header components
		headerPanel = new JPanel();
		headerPanel.setLayout(new GridLayout(1, 5));

		loadMapButton = new JButton("Charger Plan");
		loadMapButton.addActionListener(new LoadMapListener());
		headerPanel.add(loadMapButton);

		loadDeliveryButton = new JButton("Charger Livraison");
		loadDeliveryButton.addActionListener(new LoadDeliveryListener());
		headerPanel.add(loadDeliveryButton);

		computeTourButton = new JButton("Calculer Tournée");
		computeTourButton.addActionListener(new ComputeTourListener());
		headerPanel.add(computeTourButton);

		generatePlanning = new JButton("Générer feuille de route");
		generatePlanning.addActionListener(new GeneratePlanningListener());
		headerPanel.add(generatePlanning);
		
		allPanel.add(headerPanel, BorderLayout.NORTH);
		
		this.add(allPanel);
	}
	
	/**
	 * Class handling what to do when the user presses on the LoadMap button
	 */
	private class LoadMapListener implements ActionListener {

		/*
		 * (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.loadMapButtonClick();
		}
	}
	
	/**
	 * Class handling what to do when the user presses the loadDelivery button
	 */
	private class LoadDeliveryListener implements ActionListener {
		
		/*
		 * (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e){
			controller.loadDeliveryQueryButtonClick();
		}
	}
	
	/**
	 * Class handling what to do when the user presses on the button computeTour
	 * @author patrick
	 *
	 */
	private class ComputeTourListener implements ActionListener {

		/*
		 * (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.computeRouteButtonClick();
		}
		
	}

	/**
	 * Class handles what to do when the button generatePLanning is clisked.
	 */
	private class GeneratePlanningListener implements ActionListener {

		/*
		 * (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			controller.generatePlanningButtonClick();
		}
		
	}
}