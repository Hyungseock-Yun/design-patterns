package gof.designpatterns._02_structural._01_adaptor._02_after;

import gof.designpatterns._02_structural._01_adaptor._02_after.security.UserDetails;
import gof.designpatterns._02_structural._01_adaptor._02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

  AccountService accountService;

  public AccountUserDetailsService(AccountService accountService) {
    this.accountService = accountService;
  }

  @Override
  public UserDetails loadUser(String username) {
    Account accountByUsername = accountService.findAccountByUsername(username);

    return new AccountUserDtails(accountByUsername);
  }
}
