package dip.lab1.student.solution1;

import dip.lab1.*;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;
    
    /** default constructor. Is this the best way to go? */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        this.setAnnualSalary(annualSalary);
        this.setAnnualBonus(annualBonus);
    }

    
    @Override
    public double getPay() {
        return getAnnualSalary() + getAnnualBonus();
    }

    /**
     * @return the annualSalary
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * @return the annualBonus
     */
    public double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * @param annualBonus the annualBonus to set
     */
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
}
