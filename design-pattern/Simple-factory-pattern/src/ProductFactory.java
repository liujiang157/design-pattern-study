/**
 * @author maybelence
 * @descrpition π§≥ß¿‡
 * @date 2021-05-06
 */
public class ProductFactory {

    public static IProduct createProduct(ProductEnum productEnum) {
        if (ProductEnum.MOUSE == productEnum) return new MouseProduct();
        if (ProductEnum.KEYBOARD == productEnum) return new KeyBoardProduct();
        if (ProductEnum.PC == productEnum) return new PCProdcuct();
        return null;
    }
}
