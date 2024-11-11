package cn.keking.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  页面跳转
 * @author yudian-it
 * @date 2017/12/27
 */
@Controller
public class IndexController {

    /**
     * 调整首页跳转
     *
     * @return the string
     */
    @GetMapping( "/")
    public String root() {
        return "/main/index_c";
    }

}
