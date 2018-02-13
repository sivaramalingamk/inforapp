package za.ac.cput.inforshare.repository.db.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by christian on 2018/02/13.
 */

@Entity(nameInDb = "UserLanguage")
public class UserLanguage {

    @Id(autoincrement = true)
    private Long emailId;

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "languageId ")
    private String languageId ;

    @Property(nameInDb = "reading ")
    private String reading ;

    @Property(nameInDb = "writing ")
    private String writing ;

    @Property(nameInDb = "speaking ")
    private String speaking;

    @Property(nameInDb = "date")
    private String date;

    @Property(nameInDb = "state")
    private String state;


    @Generated(hash = 1543916479)
    public UserLanguage(Long emailId, Long id, String languageId , String reading , String writing  ,String speaking ,String date, String state) {
        this.emailId = emailId;
        this.id = id;
        this.languageId  = languageId ;
        this.reading  = reading ;
        this.writing  = writing ;
        this.speaking = speaking;
        this.date = date;
        this.state = state;
    }

    @Generated(hash = 586692638)
    public UserLanguage() {
    }

    public Long getEmailId() {
        return this.emailId;
    }

    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguageId() {
        return this.languageId ;
    }

    public void setLanguageId(String languageId ) {
        this.languageId  = languageId ;
    }

    public String getReading() {
        return this.reading ;
    }

    public void setReading(String reading ) {
        this.reading  = reading ;
    }

    public String getWriting() {
        return this.writing ;
    }

    public void setWriting(String writing ) {
        this.writing  = writing ;
    }

    public  String getSpeaking(){return  this.speaking; }

    public void setSpeaking( String speaking){this.speaking = speaking ;}

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}