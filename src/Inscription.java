import java.util.*;
public class Inscription {
    private String id;
    private Programme programme;
    private Date date;
    public Inscription(String  idEt,Programme programme, Date date){
        id = idEt;
        programme = programme;
        date=date;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setDateInscription(Date date) {
        this.date = date;
    }
    public Date getDateInscription(){
        return date;
    }
}
