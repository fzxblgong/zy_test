package dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends BaseMapper<User> {
    /**
     *
     * @param id
     * @return
     */
    public User findUserById(Integer id);
//    @Select("select * from user")
    public List<User> findAll();
}
