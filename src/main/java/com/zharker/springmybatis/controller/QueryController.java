package com.zharker.springmybatis.controller;

        import com.zharker.springmybatis.entity.User;
        import com.zharker.springmybatis.mapper.UserMapper;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/{id}")
    @ResponseBody
    public User queryUser(@PathVariable("id") Integer userId){
        return userMapper.selectByPrimaryKey(userId);
    }
}
