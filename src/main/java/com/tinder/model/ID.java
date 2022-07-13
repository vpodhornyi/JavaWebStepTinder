package com.tinder.model;

public abstract class ID {
  private long id;

  public ID(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }
}
