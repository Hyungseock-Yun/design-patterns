package gof.designpatterns._02_structural._01_adaptor._01_before.security;

public interface UserDetailsService {

  UserDetails loadUser(String username);

}
