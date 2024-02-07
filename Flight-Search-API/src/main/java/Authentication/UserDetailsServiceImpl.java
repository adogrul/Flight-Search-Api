package Authentication;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /*
           kullanıcıyı döndürecek olan metod örneğin kullanıcı adı ve parolası ile bir
           kullanıcı nesnesi döndürülecek bu kullanıcı nesnesi
           spring tarafından kullanıcıyı doğrulayacak.
        */
        return null; //null yerine bir kullanıcı nesnesi döndürülecektir
    }
}
