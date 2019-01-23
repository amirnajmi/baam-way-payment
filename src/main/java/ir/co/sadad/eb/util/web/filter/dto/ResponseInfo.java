package ir.co.sadad.eb.util.web.filter.dto;

import java.util.Date;

/**
 * Created by kahmadi on 11/14/2016.
 */
public class ResponseInfo {

    private String Id;
    private String requestId;
    private int status;
    private String username;
    private Date date;
    private String persionDate;
    private String time;
    private String payload;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getPersionDate() {
        return persionDate;
    }

    public void setPersionDate(String persionDate) {
        this.persionDate = persionDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
