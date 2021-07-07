package core.data;

import javax.persistence.*;

@Entity
public class Tusk {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String text;
    private String timeStart;
    private String timeEnd;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Tusk(){}

    public Tusk(String text, String timeStart, String timeEnd, User user) {
        this.text = text;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.user = user;
    }

    public String getUserName(){
        return user != null ? user.getUsername() : "<noneee>";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
