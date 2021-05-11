/**
 * @author maybelence
 * @descrpition 饿汉式单例模式 线程安全
 * @date 2021-05-08
 */

public class HungrySingleTon {

    private static HungrySingleTon singleTon = new HungrySingleTon();

    /**
     * 加if是防止被反射破坏单例
     * 能破坏单例的还有序列化和反序列化，但是这种情况需要单例的类实现Serializable接口，所以我这里直接没考虑
     */
    private HungrySingleTon(){
        if (null != singleTon)
            throw new RuntimeException("禁止通过反射来实例化对象");
    }

    public static HungrySingleTon getInstance(){
        return singleTon;
    }

}
