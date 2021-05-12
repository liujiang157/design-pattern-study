
import java.util.Date;


/**
 * @author maybelence
 * @descrpition
 * @date 2021-05-12
 */
public abstract class Report implements Cloneable {

    private String name;

    private String dept;

    private Date time;

    private String workInfo;

    abstract void printReport();


    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(String workInfo) {
        this.workInfo = workInfo;
    }


    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public enum ReportType{
        WEEK, DAY
    }

}
