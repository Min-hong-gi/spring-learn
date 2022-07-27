package net.openobject.dashboard.dto;

public class LoginDTO {
    private String user_id;
    private String password;
    public String getUser_id() {
        return user_id;
    }
    public LoginDTO(String user_id, String password) {
        this.user_id = user_id;
        this.password = password;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    @Override
    public String toString() {
        return "LoginDTO [password=" + password + ", user_id=" + user_id + "]";
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
