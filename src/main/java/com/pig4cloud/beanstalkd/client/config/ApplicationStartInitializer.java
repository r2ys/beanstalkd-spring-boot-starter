/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.beanstalkd.client.config;

import com.pig4cloud.beanstalkd.client.listener.TubeConsumerListener;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;

/**
 * @author lengleng
 * @date 2020/2/7
 */
public class ApplicationStartInitializer  {

    @EventListener({WebServerInitializedEvent.class})
    public void initialize(WebServerInitializedEvent event) {

        TubeConsumerListener bean =  event.getApplicationContext().getBean(TubeConsumerListener.class);
        bean.start();
    }
}
