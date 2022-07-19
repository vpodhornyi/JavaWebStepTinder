package com.tinder.model.group;

import com.tinder.model.BaseEntity;
import com.tinder.model.chat.Chat;
import com.tinder.model.user.User;

import java.util.List;

public abstract class Group extends BaseEntity {
  private String name;
  private User rootUser;
  private List<User> moderatorUsers;
  private List<User> users;
  private Chat chat;

  public Group(long id, String name, User rootUser) {
    super(id);
    this.name = name;
    this.rootUser = rootUser;
  }
}
