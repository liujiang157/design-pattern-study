/**
 * @author maybelence
 * @descrpition 懒汉式单例模式  线程不安全
 * @date 2021-05-08
 */
public class LazySingleTon {
    private static LazySingleTon singleTon;

    private LazySingleTon() {
    }

    public static LazySingleTon getInstance() {
        if (singleTon == null) {
            singleTon = new LazySingleTon();
        }
        return singleTon;
    }
}

/**
 * 懒汉式优化--锁方法
 * 获取对象之前一定要获取锁，性能低下
 */
class LazySycnMethodSingleTon {
    private static LazySycnMethodSingleTon singleTon;

    private LazySycnMethodSingleTon() {
    }

    public synchronized static LazySycnMethodSingleTon getInstance() {
        if (singleTon == null) {
            singleTon = new LazySycnMethodSingleTon();
        }
        return singleTon;
    }
}

/**
 * 单例模式优化--锁类对象
 * 获取对象之前一定要获取锁，性能低下
 */
class LazySycnClaszSingleTon {
    private static LazySycnClaszSingleTon singleTon;

    private LazySycnClaszSingleTon() {
    }

    public static LazySycnClaszSingleTon getInstance() {
        synchronized (LazySycnClaszSingleTon.class) {
            if (singleTon == null) {
                singleTon = new LazySycnClaszSingleTon();
            }
        }
        return singleTon;
    }
}

/**
 * 懒汉单例--双重校验加锁
 * 当singleTon已经被实例化的时候,直接返回对象，不再获取锁资源，否则获取锁资源实例化对象
 * volatile禁止new对象的时候指令重排
 */
class LazyDCLSingleTon {
    private static volatile LazyDCLSingleTon singleTon;

    private LazyDCLSingleTon(){}

    public static LazyDCLSingleTon getInstance(){
        if(singleTon ==null)
            synchronized (LazyDCLSingleTon.class) {
                if (singleTon == null) {
                    singleTon = new LazyDCLSingleTon();
                }
            }
        return singleTon;
    }
}


