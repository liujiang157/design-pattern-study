import java.lang.reflect.InvocationTargetException;

/**
 * @author maybelence
 * @descrpition 工厂类
 * @date 2021-05-06
 */
public class ProductFactory {

    public static IProduct createProduct(ProductEnum productEnum) {
        if (ProductEnum.MOUSE == productEnum) return new MouseProduct();
        if (ProductEnum.KEYBOARD == productEnum) return new KeyBoardProduct();
        if (ProductEnum.PC == productEnum) return new PCProdcuct();
        throw new IllegalArgumentException("没有这种商品类型");
    }

    public interface IProduct {
        String printMessage();
    }


    /**
     * 通过反射获取对象，满足开闭原则
     * @param className
     * @return
     * @throws Exception
     */
    public static IProduct createProduct1(String className) throws Exception {
        return (IProduct) Class.forName(className).getConstructor().newInstance();
    }

    public enum ProductEnum {
        MOUSE, KEYBOARD, PC
    }

}

