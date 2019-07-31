package ua.lv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lv.entity.User;

/**
 * Created by User on 31.07.2019.
 */
public interface UserDAO extends JpaRepository<User,Integer> {
}
