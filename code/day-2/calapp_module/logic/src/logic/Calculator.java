package logic;

import internal.CalculatorHelper;

public class Calculator {
    private CalculatorHelper calculatorHelper=new CalculatorHelper();

    public int add(int a, int b){
        return calculatorHelper.addHelper(a,b);
    }
}