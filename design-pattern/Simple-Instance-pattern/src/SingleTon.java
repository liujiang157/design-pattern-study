/**
 * @author maybelence
 * @descrpition 静态内部类实现单例模式
 * @date 2021-05-08
 */
public class SingleTon {
    private static class SingletonHolder {
        private static final SingleTon INSTANCE = new SingleTon();
    }

    private SingleTon() {
    }

    public static  SingleTon getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
