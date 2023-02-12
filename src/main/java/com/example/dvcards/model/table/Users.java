package com.example.dvcards.model.table;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @NonNull
    String Id;

    @NonNull
    String Login;

    @NonNull
    String Password;

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getId() {
        return this.Id;
    }

    public String getLogin() {
        return this.Login;
    }

    public String getPassword() {
        return this.Password;
    }

}
