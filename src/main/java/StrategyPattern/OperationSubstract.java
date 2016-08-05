package StrategyPattern;

/**
 * Created by ahmetatalay on 04/08/16.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
