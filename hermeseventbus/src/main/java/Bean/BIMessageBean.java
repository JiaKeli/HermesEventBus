package Bean;

/**
 * Created by Corey_Jia on 2018/10/23.
 */
public class BIMessageBean {
    public static String TAG_REPORT = "tag_report";
    public static int WHAT_BI_COMMON = 1001;
    public static int WHAT_BI_AD = 1002;

    private String tag;
    private int what;
    private String json;

    public BIMessageBean(String tag, int what, String json) {
        this.tag = tag;
        this.what = what;
        this.json = json;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getWhat() {
        return what;
    }

    public void setWhat(int what) {
        this.what = what;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
