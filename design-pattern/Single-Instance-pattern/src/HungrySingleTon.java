/**
 * @author maybelence
 * @descrpition ����ʽ����ģʽ �̰߳�ȫ
 * @date 2021-05-08
 */

public class HungrySingleTon {

    private static HungrySingleTon singleTon = new HungrySingleTon();

    /**
     * ��if�Ƿ�ֹ�������ƻ�����
     * ���ƻ������Ļ������л��ͷ����л����������������Ҫ��������ʵ��Serializable�ӿڣ�����������ֱ��û����
     */
    private HungrySingleTon(){
        if (null != singleTon)
            throw new RuntimeException("��ֹͨ��������ʵ��������");
    }

    public static HungrySingleTon getInstance(){
        return singleTon;
    }

}
