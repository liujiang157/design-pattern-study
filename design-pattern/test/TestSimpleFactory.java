import factory.AbstractFactory;
import factory.FlowerFactory;
import factory.MelonFactory;
import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-06
 */
public class TestSimpleFactory {

    @Test
    public void testSimpleFactory() {
        // 1. ���
        ProductFactory.IProduct mouseProduct = ProductFactory.createProduct(ProductFactory.ProductEnum.MOUSE);
        Assert.assertEquals("�������", mouseProduct.printMessage());
        // 2. ����
        ProductFactory.IProduct keyboardProduct = ProductFactory.createProduct(ProductFactory.ProductEnum.KEYBOARD);
        Assert.assertEquals("���Ǽ���", keyboardProduct.printMessage());
        // 3. ����
        ProductFactory.IProduct pcProduct = ProductFactory.createProduct(ProductFactory.ProductEnum.PC);
        Assert.assertEquals("���ǵ���", pcProduct.printMessage());
    }


    @Test
    public void testAbstractFactory() {
        // ͨ����������ȡ�ʻ�����
        AbstractFactory flowerFactory = FactoryProducer.getFactory(FactoryEnum.FLOWER);
        // ������ɫ����
        AbstractFactory.IFlower flower = flowerFactory.getFlower(FlowerFactory.FlowerEnum.ROSE);
        Assert.assertEquals("������ɫ����", flower.getColor());
        // ͨ����������ȡ�Ϲ���
        AbstractFactory melonFactory = FactoryProducer.getFactory(FactoryEnum.MELON);
        //��������
        AbstractFactory.IMelon melon = melonFactory.getMelon(MelonFactory.MelonEnum.WATER);
        Assert.assertEquals("��������", melon.getVariety());
    }

    /**
     * ���Է����ƻ�����
     * @throws Exception
     */
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


    


    /**
     * �����������̰߳�ȫ����
     */
    @Test
    public void testLazyThread(){

        ExecutorService threadpool = Executors.newFixedThreadPool(50);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threadpool.execute(() -> list.add(LazySingleTon.getInstance().hashCode()));
        }
        //�����ֹ��һ��hashcode ˵���̲߳���ȫ
        Assert.assertNotEquals(1, list.stream().distinct().count());
    }

}
