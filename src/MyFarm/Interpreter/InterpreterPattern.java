package MyFarm.Interpreter;

public class InterpreterPattern {
    //规则：浇水施肥后的土地能够使用
    public static Expression getLandStatus() {
        Expression watered = new TerminalExpression("watered");
        Expression fertilized = new TerminalExpression("fertilized");
        return new AndExpression(watered, fertilized);
    }

    public static void main(String[] args) {
        Expression isLandPrepared = getLandStatus();//初始化规则
        System.out.println(" Is land prepared?" + isLandPrepared.interpret("watered fertilized"));
        System.out.println(" Is land prepared?" + isLandPrepared.interpret("dry fertilized"));
    }
}
