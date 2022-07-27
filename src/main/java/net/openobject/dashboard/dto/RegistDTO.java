package net.openobject.dashboard.dto;

public class RegistDTO {
    private String name;
    private String user_id;
    private String password;
    
    public RegistDTO(String name, String user_id, String password) {
        this.name = name;
        this.user_id = user_id;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
