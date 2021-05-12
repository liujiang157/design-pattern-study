import java.util.Date;
import java.util.HashMap;

/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-12
 */
public class ReportTemplate {
    private static HashMap<Report.ReportType, Report> reportMap = new HashMap<>();


    public static Report getTemplate(Enum shapeType) {
        Report tempReport = reportMap.get(shapeType);
        return (Report) tempReport.clone();
    }

    /**
     * 加载模板，读取数据
     */
    public static void loadTemplate() {
        WeekReport weekReport = new WeekReport();
        weekReport.setName("Maybelence");
        weekReport.setDept("软件");
        weekReport.setTime(new Date());
        weekReport.setWorkInfo("本周摸鱼");
        reportMap.put(Report.ReportType.WEEK,weekReport);
    }
}
