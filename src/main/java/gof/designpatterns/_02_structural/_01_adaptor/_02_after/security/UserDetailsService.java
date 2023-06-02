package gof.designpatterns._02_structural._01_adaptor._02_after.security;

public interface UserDetailsService {

  UserDetails loadUser(String username);

}
