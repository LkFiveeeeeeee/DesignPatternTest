package MyFarm.Interpreter;

public class OrExpression implements Expression {//or规则

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {//建立or规则
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }//检验是否有其中一个关键字
}
