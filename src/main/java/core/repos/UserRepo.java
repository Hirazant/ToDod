package core.repos;

import core.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}