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
class EstateAgentSales extends EstateAgent {
    public EstateAgentSales(String agentName, double propertySaleAmount) {
        super(agentName, propertySaleAmount);
    }
        public void printPropertyReport() {
        JOptionPane.showMessageDialog(null,"Estate Agent Name: " + getAgentName()
         + "\n Property Price: R" + getPropertyPrice()
        + "\n Agent Commission: R" + getAgentCommission());
    }
    }
