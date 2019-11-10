package MyFarm.Responsibility;

public abstract class Handler {
    //下一处理器
    private Handler nextHandler;

    //处理器进行处理
    public abstract void handleRequest();

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
