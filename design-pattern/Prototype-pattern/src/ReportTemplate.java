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
     * ����ģ�壬��ȡ����
     */
    public static void loadTemplate() {
        WeekReport weekReport = new WeekReport();
        weekReport.setName("Maybelence");
        weekReport.setDept("���");
        weekReport.setTime(new Date());
        weekReport.setWorkInfo("��������");
        reportMap.put(Report.ReportType.WEEK,weekReport);
    }
}
