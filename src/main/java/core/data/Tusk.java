package core.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tusk {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String text;
    private String timeStart;
    private String timeEnd;

    public Tusk(){}

    public Tusk(String tusk, String timeStart, String timeEnd) {
        this.text = tusk;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getTusk() {
        return text;
    }

    public void setTusk(String tusk) {
        this.text = tusk;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
}
