package com.tinder.model.message;

import com.tinder.model.ID;
import com.tinder.model.chat.Chat;
import com.tinder.model.user.User;

import java.util.Date;

public abstract class Message extends ID {
  private Chat chat;
  private User user;
  private String message;
  private Date createdAt;

  public Message(long id) {
    super(id);
  }
}
