package net.openobject.dashboard.dto;

public class User {
    private int id;
    private String user_id;
    private String name;
    private int level;
    

    public User(int id, String user_id, String name, int level) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.level = level;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", level=" + level + ", name=" + name + ", user_id=" + user_id + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}
