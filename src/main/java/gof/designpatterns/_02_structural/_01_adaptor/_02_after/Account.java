package gof.designpatterns._02_structural._01_adaptor._02_after;

import gof.designpatterns._02_structural._01_adaptor._02_after.security.UserDetails;
import lombok.Data;

@Data
public class Account implements UserDetails {

  private String name;

  private String password;

  private String email;

  @Override
  public String getUsername() {
    return this.name;
  }

  @Override
  public String getPassword() {
    return this.password;
  }

}
