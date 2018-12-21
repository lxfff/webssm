package com.name.web.controller;

import com.name.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 标题:
 * 描述:
 *
 * @autho LXF
 * @date 2018/12/21 20:43
 * |                           _ooOoo_
 * |                          o8888888o
 * |                          88" . "88
 * |                          (| -_- |)
 * |                          O\  =  /O
 * |                       ____/`---'\____
 * |                     .'  \\|     |//  `.
 * |                    /  \\|||  :  |||//  \
 * |                   /  _||||| -:- |||||-  \
 * |                   |   | \\\  -  /// |   |
 * |                   | \_|  ''\---/''  |   |
 * |                   \  .-\__  `-`  ___/-. /
 * |                 ___`. .'  /--.--\  `. . __
 * |              ."" '<  `.___\_<|>_/___.'  >'"".
 * |             | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 * |             \  \ `-.   \_ __\ /__ _/   .-` /  /
 * |        ======`-.____`-.___\_____/___.-`____.-'======
 * |                           `=---='
 * |        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * |                 佛祖保佑       永无BUG
 */
@Controller
public class Demo {
    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/demo")
    public void demo() {
        demoService.updateDemo();
    }
}
