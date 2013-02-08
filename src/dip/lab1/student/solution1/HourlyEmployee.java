package dip.lab1.student.solution1;

import dip.lab1.*;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    private double hourlyWage;
    private double hoursWorkedPerYear;
    
    /** default constructor. Is this the best way to go? */
    public HourlyEmployee(double hourlyWage, double hoursWorkedPerYear) {
        this.setHourlyWage(hourlyWage);
        this.setHoursWorkedPerYear(hoursWorkedPerYear);
    }

    @Override
    public double getPay() {
        return getHourlyWage() * getHoursWorkedPerYear();
    }

    /**
     * @return the hourlyWage
     */
    public double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * @param hourlyWage the hourlyWage to set
     */
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    /**
     * @return the hoursWorkedPerYear
     */
    public double getHoursWorkedPerYear() {
        return hoursWorkedPerYear;
    }

    /**
     * @param hoursWorkedPerYear the hoursWorkedPerYear to set
     */
    public void setHoursWorkedPerYear(double hoursWorkedPerYear) {
        this.hoursWorkedPerYear = hoursWorkedPerYear;
    }
}
