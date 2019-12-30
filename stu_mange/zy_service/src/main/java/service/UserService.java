package service;

import domain.User;

import java.util.List;

public interface UserService {
    /**
     * 根据id查询user
     * @param id
     * @return
     */
    public User findUserById(Integer id);
    public List<User> findAll();
}
