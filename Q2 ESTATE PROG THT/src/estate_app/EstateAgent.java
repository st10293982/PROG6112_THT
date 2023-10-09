/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estate_app;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
abstract class EstateAgent implements iEstateAgent {
    private String AgentName;
    private double PropertyPrice;

    public EstateAgent(String agentName, double propertyPrice) {
        this.AgentName = agentName;
        this.PropertyPrice = propertyPrice;
    }

    public String getAgentName() {
        AgentName = JOptionPane.showInputDialog(null,"Please enter the agent's name");
        return AgentName;
    }

    public double getPropertyPrice() {
       PropertyPrice = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the price of the property"));
        return PropertyPrice;
    }

    public double getAgentCommission() {
        // Calculate commission as 20% of the property sale price
        return 0.2 * PropertyPrice;
    }
}

