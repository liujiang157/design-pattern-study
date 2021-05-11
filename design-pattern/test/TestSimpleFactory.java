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
        // 1. 鼠标
        ProductFactory.IProduct mouseProduct = ProductFactory.createProduct(ProductFactory.ProductEnum.MOUSE);
        Assert.assertEquals("我是鼠标", mouseProduct.printMessage());
        // 2. 键盘
        ProductFactory.IProduct keyboardProduct = ProductFactory.createProduct(ProductFactory.ProductEnum.KEYBOARD);
        Assert.assertEquals("我是键盘", keyboardProduct.printMessage());
        // 3. 电脑
        ProductFactory.IProduct pcProduct = ProductFactory.createProduct(ProductFactory.ProductEnum.PC);
        Assert.assertEquals("我是电脑", pcProduct.printMessage());
    }


    @Test
    public void testAbstractFactory() {
        // 通过生成器获取鲜花工厂
        AbstractFactory flowerFactory = FactoryProducer.getFactory(FactoryEnum.FLOWER);
        // 构造蓝色妖姬
        AbstractFactory.IFlower flower = flowerFactory.getFlower(FlowerFactory.FlowerEnum.ROSE);
        Assert.assertEquals("我是蓝色妖姬", flower.getColor());
        // 通过生成器获取瓜工厂
        AbstractFactory melonFactory = FactoryProducer.getFactory(FactoryEnum.MELON);
        //构造西瓜
        AbstractFactory.IMelon melon = melonFactory.getMelon(MelonFactory.MelonEnum.WATER);
        Assert.assertEquals("我是西瓜", melon.getVariety());
    }

    /**
     * 测试反射破坏单例
     * @throws Exception
     */
    @Test
    public void testReflectDestoryInstance() throws Exception {
        // 获取类的显式构造器
        Constructor<HungrySingleTon> construct = HungrySingleTon.class.getDeclaredConstructor();
        // 可访问私有构造器
        construct.setAccessible(true);
        // 利用反射构造新对象
        HungrySingleTon obj1 = construct.newInstance();
        // 通过正常方式获取单例对象
        HungrySingleTon obj2 = HungrySingleTon.getInstance();
        // 判断对象不是单例对象
        Assert.assertNotSame(obj1, obj2);
    }


    


    /**
     * 测试懒汉的线程安全问题
     */
    @Test
    public void testLazyThread(){

        ExecutorService threadpool = Executors.newFixedThreadPool(50);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threadpool.execute(() -> list.add(LazySingleTon.getInstance().hashCode()));
        }
        //如果不止有一个hashcode 说明线程不安全
        Assert.assertNotEquals(1, list.stream().distinct().count());
    }

}
