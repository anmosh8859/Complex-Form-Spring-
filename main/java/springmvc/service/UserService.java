package springmvc.service;

import springmvc.model.User;
import springmvc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int createUser(User user){
        return this.userDao.saveUser(user);
    }
}
