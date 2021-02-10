 package model;

public class CheckIn {
    private String clientName;
    private String title;
    private String dateIn;
    private String status;

    public CheckIn() {
    }

    public CheckIn(String clientName, String title, String dateIn, String status) {
        this.clientName = clientName;
        this.title = title;
        this.dateIn = dateIn;
        this.status = status;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
