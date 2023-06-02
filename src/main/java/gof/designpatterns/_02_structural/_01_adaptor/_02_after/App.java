package gof.designpatterns._02_structural._01_adaptor._02_after;

import gof.designpatterns._02_structural._01_adaptor._02_after.security.LoginHandler;
import gof.designpatterns._02_structural._01_adaptor._02_after.security.UserDetailsService;

public class App {

  public static void main(String[] args) {
    AccountService accountService = new AccountService();
    UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
    LoginHandler loginHandler = new LoginHandler(userDetailsService);

    String login = loginHandler.login("jinu", "jinu");
    System.out.println("login = " + login);
  }
}
