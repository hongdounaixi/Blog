package com.hxj.controller;

import com.hxj.entity.User;
import com.hxj.service.impl.UserServiceImpl;
import com.hxj.status.MessageConstant;
import com.hxj.status.Result;
import com.hxj.util.RedisUtil;
import com.wf.captcha.SpecCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hxj
 * @Date: 2021/06/07/16:33
 * @Description:
 */
@RequestMapping("/user")
@RestController
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @Autowired
    private RedisUtil redisUtil;

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        User user1 = userService.login(user.getUsername(),user.getPassword());
        System.out.println(user1);
        return new Result(true, "登录成功", MessageConstant.OK);
    }

    @RequestMapping("/captcha")
    public Result captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 4);
        String verCode = specCaptcha.text().toLowerCase();
        String key = UUID.randomUUID().toString();
        // 存入redis并设置过期时间为10分钟
        redisUtil.set(key, verCode, 600);
        request.getSession().setAttribute("CAPTCHA", verCode);  //存入session
        // 将key和base64返回给前端
        return new Result(true, key, MessageConstant.VERIFICATION_CODE_SUCCESS, specCaptcha.toBase64());
    }
}
