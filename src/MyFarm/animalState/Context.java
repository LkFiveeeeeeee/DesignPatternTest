package MyFarm.animalState;

public interface Context {
    /**
     * 状态变化
     *
     * @param currentTime 现在时间
     */
    void timeChange(int currentTime);

    /**
     * 喂食
     *
     * @param currentTime 现在时间
     */
    void getFed(int currentTime);
}
