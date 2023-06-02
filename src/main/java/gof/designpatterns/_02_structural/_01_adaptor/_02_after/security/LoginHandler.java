package gof.designpatterns._02_structural._01_adaptor._02_after.security;

public class LoginHandler {

  UserDetailsService userDetailsService;

  public LoginHandler(UserDetailsService userDetailsService) {
    this.userDetailsService = userDetailsService;
  }

  public String login(String username, String password) {
    UserDetails userDetails = userDetailsService.loadUser(username);
    if (userDetails.getPassword().equals(password)) {
      return userDetails.getUsername();
    } else {
      throw new IllegalArgumentException();
    }
  }
}
