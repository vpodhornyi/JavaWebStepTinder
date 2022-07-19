package com.tinder.model;

import com.tinder.model.user.User;

import java.util.Date;

public abstract class BaseEntity {
  private long id;
  private Date createdAt;
  private Date updatedAt;
  private User createdBy;
  private User updatedBy;

  public BaseEntity(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }
}
