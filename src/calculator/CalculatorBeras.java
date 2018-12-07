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
public class CalculatorBeras extends CalculatorAbstract{
    private double x;
    private double y;

    public CalculatorBeras(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public double Ping(){
        return(x*y);
    }
    @Override
    public double Po(){
        return (x/y);
    }
    @Override
    public double Lan(){
        return (x+y);
    }
    @Override
    public double Do(){
        return (x-y);
    }
    }