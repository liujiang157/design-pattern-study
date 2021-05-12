/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-12
 */
public abstract class Builder {

    protected EcoTank item = new EcoTank();

    abstract Builder buildTank(Tank tank); // ���

    abstract Builder buildFilter(Filter filter); // ����

    abstract Builder buildFish(Fish fish); // ��

    abstract Builder buildLand(Land land); // �쾰

    public EcoTank returnEcoTank() {
        return item;
    }


    public enum Tank {
        BIG, //���
        SMALL  //С��
    }


    public enum Filter {
        OXYGEN, //��������
        FALL  //�ٲ�����
    }


    public enum Fish {
        DRAGON, //����
        CARP  //����
    }


    public enum Land {
        GRASS, //�ݸ�
        SEA  //����
    }

}
