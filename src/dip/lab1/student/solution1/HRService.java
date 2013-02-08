package dip.lab1.student.solution1;

import dip.lab1.*;
import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {
    private Employee emp;
    
    
    public HRService(Employee emp) {
        this.setEmp(emp);
    }
    
    private void setEmp(Employee emp) {
        this.emp = emp;
    }
    
    public double getEmpPay() {
        return emp.getPay();
    }
    
}
