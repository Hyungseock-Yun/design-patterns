package gof.designpatterns._02_structural._01_adaptor._02_after;

import gof.designpatterns._02_structural._01_adaptor._02_after.security.UserDetails;
import gof.designpatterns._02_structural._01_adaptor._02_after.security.UserDetailsService;

public class AccountService implements UserDetailsService {

  Account findAccountByUsername(String username) {
    Account account = new Account();
    account.setName(username);
    account.setPassword(username);
    account.setEmail(username);

    return account;
  }

  public void createNewAccount(Account account) {}

  public void updateAccount(Account account) {}

  @Override
  public UserDetails loadUser(String username) {
    return findAccountByUsername(username);
  }
}
