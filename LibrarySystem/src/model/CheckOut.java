package model;

public class CheckOut {
    private String clientName;
    private String title;
    private String dateOut;
    private String status;

    public CheckOut() {
    }

    public CheckOut(String clientName, String title, String dateOut, String status) {
        this.clientName = clientName;
        this.title = title;
        this.dateOut = dateOut;
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

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
