package ir.co.sadad.eb.repository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Dependent
public class UserRepository  {

    @Inject
    private EntityManager em;

//    @Override
//    protected EntityManager getEntityManager() {
//        return em;
//    }
//
//    public UserRepository() {
//        super(User.class);
//    }
//
//    public Optional<User> findOneByLogin(String login) {
//        return findSingleByNamedQuery("findUserByLogin", singletonMap("login", login));
//    }
//
//    public Optional<User> findOneByEmail(String email) {
//        return findSingleByNamedQuery("findUserByEmail", singletonMap("email", email));
//    }
//
//    public Optional<User> findOneByResetKey(String resetKey) {
//        return findSingleByNamedQuery("findUserByResetKey", singletonMap("resetKey", resetKey));
//    }
//
//    public Optional<User> findOneByActivationKey(String activationKey) {
//        return findSingleByNamedQuery("findUserByActivationKey", singletonMap("activationKey", activationKey));
//    }
//
//    public Optional<User> findOneById(Long userId) {
//        return findSingleByNamedQuery("findUserByUserId", singletonMap("id", userId));
//    }
//
//    public Optional<User> findOneWithAuthoritiesById(Long userId) {
//        return findSingleByNamedQuery("findUserByUserId", "graph.user.authorities", singletonMap("id", userId));
//    }
//
//    public Optional<User> findOneWithAuthoritiesByLogin(String login) {
//        return findSingleByNamedQuery("findUserByLogin", "graph.user.authorities", singletonMap("login", login));
//    }
//
//    public List<User> getUsersWithAuthorities(int startPosition, int size) {
//        return findRange(startPosition, size, "graph.user.authorities");
//    }

//    public abstract Collection<User> findAllOrderByFirstNameAsc(@FirstResult int start, @MaxResults int size);
}
