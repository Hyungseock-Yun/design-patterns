package gof.designpatterns._02_structural._01_adaptor._02_after;

import gof.designpatterns._02_structural._01_adaptor._02_after.security.UserDetails;

public class AccountUserDtails implements UserDetails {

  private Account account;

  public AccountUserDtails(Account account) {
    this.account = account;
  }

  @Override
  public String getUsername() {
    return this.account.getName();
  }

  @Override
  public String getPassword() {
    return this.account.getPassword();
  }
}
