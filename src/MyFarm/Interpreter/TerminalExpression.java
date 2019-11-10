package MyFarm.Interpreter;

public class TerminalExpression implements Expression {//单独储存一个关键字

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {//检测输入中是否存在关键字
        return context.contains(data);
    }
}
