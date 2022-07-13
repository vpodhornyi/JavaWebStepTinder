package com.tinder.model.user;

import com.tinder.model.ID;
import com.tinder.model.chat.Chat;

import java.util.Date;
import java.util.List;

public abstract class User extends ID {
  private String name;
  private String surname;
  private String password;
  private String email;
  private String avatar;
  private List<Chat> chatList;
  private Date createdAt;

  public User(long id, String name, String surname, String password, String email, String avatar) {
    super(id);
    this.name = name;
    this.surname = surname;
    this.password = password;
    this.email = email;
    this.avatar = avatar;
  }
}
