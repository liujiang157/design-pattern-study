import java.awt.*;
import java.awt.font.TextAttribute;
import java.text.SimpleDateFormat;
import java.util.HashMap;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-12
 */
public class WeekReport extends Report{
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    void printReport() {
        System.out.println("==================�����ܱ�=====================");
        System.out.println("������"+getName()+"   ���ţ�"+getDept()+"   "+"ʱ��:"+format.format(getTime()));
        System.out.println("�������ݣ���������");
    }
}
