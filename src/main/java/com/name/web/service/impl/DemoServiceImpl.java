package com.name.web.service.impl;

import com.name.web.dao.DemoDao;
import com.name.web.model.Demo;
import com.name.web.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 标题:
 * 描述:
 *
 * @autho LXF
 * @date 2018/12/21 20:38
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
@Service
public class DemoServiceImpl implements DemoService {
    private final static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
    private final static Boolean isDebugEnabled = logger.isDebugEnabled();
    @Autowired
    private DemoDao demoDao;

    @Override
    public void updateDemo() {
        if (isDebugEnabled) {
            logger.debug("用户信控处理服务入参{}" + "你好");
        }
        Demo demo = new Demo();
        demo.setDemoId(1l);
        demo.setDemoName("niHao");
        demoDao.updateByPrimaryKey(demo);
        System.out.println("修改完成 事物启动");
        throw new RuntimeException();
    }
}
