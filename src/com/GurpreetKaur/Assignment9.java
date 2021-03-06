package com.GurpreetKaur;

import javax.swing.*;
import java.text.DecimalFormat;

public class Assignment9 {
    public static void main(String[] args) {
        String input;        // To hold the user's input
        double sales;        // Monthly sales
        double rate;         // Commission rate
        double commission;   // Amount of commission
        double advance;      // Advanced pay
        double pay;          // Salesperson's pay

        // Create a DecimalFormat object for dollar amounts.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        // Create a DecimalFormat object for percentages.
        DecimalFormat percent = new DecimalFormat("#0%");

        // Get the monthly sales.
        input = JOptionPane.showInputDialog("Enter the amount of monthly sales.");
        sales = Double.parseDouble(input);

        // Get the advanced pay.
        input = JOptionPane.showInputDialog("Enter the amount of advanced pay.");
        advance = Double.parseDouble(input);

        // Determine the rate of commission.
        if (sales < 10000)
            rate = 0.05;            // 5% commission rate
        else if (sales < 15000)
            rate = 0.1;             // 10% commission rate
        else if (sales < 18000)
            rate = 0.12;            // 12% commission rate
        else if (sales < 22000)
            rate = 0.15;            // 15% commission rate
        else
            rate = 0.16;            // 16% commission rate

        // Calculate the amount of commission.
        commission = rate * sales;

        // Calculate the salesperson's pay.
        pay = commission - advance;

        if(pay>0) {
            // Display the salesperson's commission rate and pay.
            JOptionPane.showMessageDialog(null, "Commission rate is " +
                    percent.format(rate) + "($" + dollar.format(commission) + ")" + ". The amount of pay is $" + dollar.format(pay));
        }
        else {
            JOptionPane.showMessageDialog(null, "The salesperson must reimburse the amount $"+dollar.format(Math.abs(pay))+" to company ");
        }
        System.exit(0);
    }
}

