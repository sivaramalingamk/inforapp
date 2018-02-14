package za.ac.cput.inforshare.repository.db.model.users;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by christian on 2018/02/11.
 */
@Entity(nameInDb = "ValidUser")
public class ValidUser {

    @Id
    private String siteId ;

    @Id
    private String userId  ;

    @Property(nameInDb = "date")
    private String date;

    @Property(nameInDb = "action  ")
    private String action  ;


    @Generated(hash = 1543916479)
    public ValidUser(String siteId , String userId  ,String date, String action  ) {
        this.siteId  = siteId ;
        this.userId   = userId  ;
        this.date = date;
        this.action   = action  ;
    }

    @Generated(hash = 586692638)
    public ValidUser() {
    }

    public String getSiteId() {
        return this.siteId ;
    }

    public void setSiteId(String siteId) {
        this.siteId  = siteId ;
    }


    public String getUserId() {
        return this.userId  ;
    }

    public void setUserId(String userId  ) {
        this.userId   = userId  ;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAction() {
        return this.action  ;
    }

    public void setAction(String action  ) {
        this.action   = action  ;
    }
}