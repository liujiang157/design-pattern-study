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
        System.out.println("==================工作周报=====================");
        System.out.println("姓名："+getName()+"   部门："+getDept()+"   "+"时间:"+format.format(getTime()));
        System.out.println("工作内容：本周摸鱼");
    }
}
