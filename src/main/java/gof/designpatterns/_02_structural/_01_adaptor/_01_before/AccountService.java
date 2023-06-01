package gof.designpatterns._02_structural._01_adaptor._01_before;

public class AccountService {

  private Account findAccountByUsername(String username) {
    Account account = new Account();
    account.setName(username);
    account.setPassword(username);
    account.setEmail(username);

    return account;
  }

  public void createNewAccount(Account account) {}

  public void updateAccount(Account account) {}

}
