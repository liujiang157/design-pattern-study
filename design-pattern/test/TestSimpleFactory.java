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
        // 1. 鼠标
        IProduct mouseProduct = ProductFactory.createProduct(ProductEnum.MOUSE);
        Assert.assertEquals("我是鼠标", mouseProduct.printMessage());
        // 2. 键盘
        IProduct keyboardProduct = ProductFactory.createProduct(ProductEnum.KEYBOARD);
        Assert.assertEquals("我是键盘", keyboardProduct.printMessage());
        // 3. 电脑
        IProduct pcProduct = ProductFactory.createProduct(ProductEnum.PC);
        Assert.assertEquals("我是电脑", pcProduct.printMessage());
    }


    @Test
    public void testAbstractFactory() {
        // 获取鲜花工厂
        AbstractFactory flowerFactory = FactoryProducer.getFactory(FactoryEnum.FLOWER);
        // 构造蓝色妖姬
        IFlower flower = flowerFactory.getFlower(FlowerEnum.ROSE);
        Assert.assertEquals("我是蓝色妖姬", flower.getColor());
        // 获取瓜工厂
        AbstractFactory melonFactory = FactoryProducer.getFactory(FactoryEnum.MELON);
        //构造西瓜
        IMelon melon = melonFactory.getMelon(MelonEnum.WATER);
        Assert.assertEquals("我是西瓜", melon.getVariety());
    }


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
        //如果不止有一个hashcode 说明线程不安全 （多试几次）
        Assert.assertNotEquals(1, list.stream().distinct().count());
    }

}
