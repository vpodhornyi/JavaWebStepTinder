package com.tinder.model.chat;

import com.tinder.model.BaseEntity;
import com.tinder.model.message.Message;
import com.tinder.model.user.User;

import java.util.List;

public abstract class Chat extends BaseEntity {
  private List<User> userList;
  private List<Message> messageList;

  public Chat(long id) {
    super(id);
  }
}
