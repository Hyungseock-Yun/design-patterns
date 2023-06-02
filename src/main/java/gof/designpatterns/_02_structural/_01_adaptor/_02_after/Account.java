package gof.designpatterns._02_structural._01_adaptor._02_after;

import gof.designpatterns._02_structural._01_adaptor._02_after.security.UserDetails;
import lombok.Data;

/**
 * 클래스를 나누지 않고, 기존 클래스에 직접 implements 해서 사용해도 된다.
 * (단, SRP 입장에서 보자면 클래스를 쪼개는게 나음)
 */
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
