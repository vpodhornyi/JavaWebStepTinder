package com.tinder.model.group;

import com.tinder.model.user.User;

public class DefaultGroup extends Group{
  public DefaultGroup(long id, String name, User rootUser) {
    super(id, name, rootUser);
  }
}
