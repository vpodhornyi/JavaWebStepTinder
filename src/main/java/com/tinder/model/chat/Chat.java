package com.tinder.model.chat;

import com.tinder.model.ID;
import com.tinder.model.message.Message;
import com.tinder.model.user.User;

import java.util.List;

public abstract class Chat extends ID {
  private List<User> userList;
  private List<Message> messageList;

  public Chat(long id) {
    super(id);
  }
}
