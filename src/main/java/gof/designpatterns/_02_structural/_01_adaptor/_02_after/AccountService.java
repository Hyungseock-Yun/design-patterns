package gof.designpatterns._02_structural._01_adaptor._02_after;

import gof.designpatterns._02_structural._01_adaptor._02_after.security.UserDetails;
import gof.designpatterns._02_structural._01_adaptor._02_after.security.UserDetailsService;

/**
 * 클래스를 나누지 않고, 기존 클래스에 직접 implements 해서 사용해도 된다.
 * (단, SRP 입장에서 보자면 클래스를 쪼개는게 나음)
 */
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
