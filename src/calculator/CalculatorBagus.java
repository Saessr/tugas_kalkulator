/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Lk09Nu2UTY
 */
public class CalculatorBagus extends CalculatorAbstractBagus{
    private double x;
    private double y;

    public CalculatorBagus(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public double akar() {
        return (Math.sqrt(x));
    }

    @Override
    public double pangkat() {
        return (Math.pow(x, y));
    }
}