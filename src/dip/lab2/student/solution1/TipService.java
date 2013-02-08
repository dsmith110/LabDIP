package dip.lab2.student.solution1;

/**
 *
 * @author dsmith110
 */
public class TipService {
    
    public TipCalculatorStrategy tip;
    
    public TipService(TipCalculatorStrategy tip) {
        this.tip = tip;
    }
    
    public double getTip() {
        return tip.getTip();
    }
    
    /**
     * Another way to assign tip
     */
    public void setTip(TipCalculatorStrategy tip) {
        this.tip = tip;
    }
}
