package dtos.requst;

public class DiaryReqisterRequest {
    private String userName;
    private String password;
    private  boolean isLock;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLock() {
        return isLock;
    }

    public void setLock(boolean lock) {
        this.isLock = lock;
    }
}

