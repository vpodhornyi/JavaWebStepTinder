package com.tinder.model.like;

import com.tinder.model.ID;
import com.tinder.model.user.User;

import java.util.Date;

public abstract class Like extends ID {
  private User user;
  private User userLiked;
  private boolean status;
  private Date createdAt;

  public Like(long id) {
    super(id);
  }
}
