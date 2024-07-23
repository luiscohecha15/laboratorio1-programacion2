package org.example.lab1;

public class User {
    private String id;
    private String userName;
    private boolean voto = false;

    public User(String id, String userName,boolean voto ) {
        this.userName = userName;
        this.id = id;
        this.voto = voto;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }
}
