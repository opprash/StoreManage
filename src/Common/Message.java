package Common;

public class Message implements java.io.Serializable {

    private String mesType;
    private String con;
    private User u;

    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }
}
