import factory.AbstractFactory;
import factory.FlowerEnum;
import factory.IFlower;
import factory.IMelon;
import factory.MelonEnum;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-06
 */
public class TestSimpleFactory {

    @Test
    public void testFactory() {
        // 1. ���
        IProduct mouseProduct = ProductFactory.createProduct(ProductEnum.MOUSE);
        Assert.assertEquals("�������", mouseProduct.printMessage());
        // 2. ����
        IProduct keyboardProduct = ProductFactory.createProduct(ProductEnum.KEYBOARD);
        Assert.assertEquals("���Ǽ���", keyboardProduct.printMessage());
        // 3. ����
        IProduct pcProduct = ProductFactory.createProduct(ProductEnum.PC);
        Assert.assertEquals("���ǵ���", pcProduct.printMessage());
    }


    @Test
    public void testAbstractFactory() {
        // ��ȡ�ʻ�����
        AbstractFactory flowerFactory = FactoryProducer.getFactory(FactoryEnum.FLOWER);
        // ������ɫ����
        IFlower flower = flowerFactory.getFlower(FlowerEnum.ROSE);
        Assert.assertEquals("������ɫ����", flower.getColor());
        // ��ȡ�Ϲ���
        AbstractFactory melonFactory = FactoryProducer.getFactory(FactoryEnum.MELON);
        //��������
        IMelon melon = melonFactory.getMelon(MelonEnum.WATER);
        Assert.assertEquals("��������", melon.getVariety());
    }


    @Test
    public void testReflectDestoryInstance() throws Exception {
        // ��ȡ�����ʽ������
        Constructor<HungrySingleTon> construct = HungrySingleTon.class.getDeclaredConstructor();
        // �ɷ���˽�й�����
        construct.setAccessible(true);
        // ���÷��乹���¶���
        HungrySingleTon obj1 = construct.newInstance();
        // ͨ��������ʽ��ȡ��������
        HungrySingleTon obj2 = HungrySingleTon.getInstance();
        // �ж϶����ǵ�������
        Assert.assertNotSame(obj1, obj2);
    }


    @Test
    public void testHungryThreadDanger(){

        ExecutorService threadpool = Executors.newFixedThreadPool(50);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threadpool.execute(new Runnable() {
                public void run() {
                    list.add(LazySingleTon.getInstance().hashCode());
                }
            });
        }
        //�����ֹ��һ��hashcode ˵���̲߳���ȫ �����Լ��Σ�
        Assert.assertNotEquals(1, list.stream().distinct().count());
    }

}
