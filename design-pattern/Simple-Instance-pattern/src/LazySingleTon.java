/**
 * @author maybelence
 * @descrpition ����ʽ����ģʽ  �̲߳���ȫ
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
 * ����ʽ�Ż�--������
 * ��ȡ����֮ǰһ��Ҫ��ȡ�������ܵ���
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
 * ����ģʽ�Ż�--�������
 * ��ȡ����֮ǰһ��Ҫ��ȡ�������ܵ���
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
 * ��������--˫��У�����
 * ��singleTon�Ѿ���ʵ������ʱ��,ֱ�ӷ��ض��󣬲��ٻ�ȡ����Դ�������ȡ����Դʵ��������
 * volatile��ֹnew�����ʱ��ָ������
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


