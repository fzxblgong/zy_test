package service.impl;

import dao.UserDao;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
