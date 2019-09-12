package com.atguigu.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/9/11.
 */
@Component//放到spring容器中
@Service//引入的是dubbo的service，将服务发布出去
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
