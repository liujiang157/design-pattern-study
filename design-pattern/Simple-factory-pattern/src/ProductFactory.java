import java.lang.reflect.InvocationTargetException;

/**
 * @author maybelence
 * @descrpition ������
 * @date 2021-05-06
 */
public class ProductFactory {

    public static IProduct createProduct(ProductEnum productEnum) {
        if (ProductEnum.MOUSE == productEnum) return new MouseProduct();
        if (ProductEnum.KEYBOARD == productEnum) return new KeyBoardProduct();
        if (ProductEnum.PC == productEnum) return new PCProdcuct();
        throw new IllegalArgumentException("û��������Ʒ����");
    }

    public interface IProduct {
        String printMessage();
    }


    /**
     * ͨ�������ȡ�������㿪��ԭ��
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

