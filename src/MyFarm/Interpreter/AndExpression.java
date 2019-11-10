package MyFarm.Interpreter;

public class AndExpression implements Expression {//and规则

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {//建立and规则
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);//比较再context中是否同时出现两个关键词
    }
}
