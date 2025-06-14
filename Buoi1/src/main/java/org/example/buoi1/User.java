package org.example.buoi1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class User {

  private final Phone phone;

  @Autowired
    public User( Phone phone) {
      this.phone = phone;
  }

  public void makeCall(){
      phone.call();
  }
}
