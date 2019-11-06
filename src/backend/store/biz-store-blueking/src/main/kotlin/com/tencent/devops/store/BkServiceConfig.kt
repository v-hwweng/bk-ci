/*
 * Tencent is pleased to support the open source community by making BK-CI 蓝鲸持续集成平台 available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * BK-CI 蓝鲸持续集成平台 is licensed under the MIT license.
 *
 * A copy of the MIT License is included in this file.
 *
 *
 * Terms of the MIT License:
 * ---------------------------------------------------
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.tencent.devops.store

import com.tencent.devops.common.event.dispatcher.pipeline.mq.MQEventDispatcher
import com.tencent.devops.store.service.atom.impl.BkAtomCooperationServiceImpl
import com.tencent.devops.store.service.atom.impl.BkAtomMemberServiceImpl
import com.tencent.devops.store.service.atom.impl.BkAtomNotifyServiceImpl
import com.tencent.devops.store.service.atom.impl.BkAtomReleaseServiceImpl
import com.tencent.devops.store.service.atom.impl.BkAtomServiceImpl
import com.tencent.devops.store.service.atom.impl.BkMarketAtomServiceImpl
import com.tencent.devops.store.service.common.impl.BkStoreNotifyServiceImpl
import com.tencent.devops.store.service.common.impl.BkStoreUserServiceImpl
import com.tencent.devops.store.service.container.impl.BkContainerServiceImpl
import com.tencent.devops.store.service.template.impl.BkMarketTemplateServiceImpl
import com.tencent.devops.store.service.template.impl.BkTemplateNotifyServiceImpl
import com.tencent.devops.store.service.template.impl.BkTemplateReleaseServiceImpl
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BkServiceConfig {

    @Bean
    fun containerService() = BkContainerServiceImpl()

    @Bean
    fun storeUserService() = BkStoreUserServiceImpl()

    @Bean
    fun storeNotifyService() = BkStoreNotifyServiceImpl()

    @Bean
    fun atomService() = BkAtomServiceImpl()

    @Bean
    fun marketAtomService() = BkMarketAtomServiceImpl()

    @Bean
    fun atomMemberService() = BkAtomMemberServiceImpl()

    @Bean
    fun atomReleaseService() = BkAtomReleaseServiceImpl()

    @Bean
    fun atomNotifyService() = BkAtomNotifyServiceImpl()

    @Bean
    fun atomCooperationService() = BkAtomCooperationServiceImpl()

    @Bean
    fun templateNotifyService() = BkTemplateNotifyServiceImpl()

    @Bean
    fun marketTemplateService() = BkMarketTemplateServiceImpl()

    @Bean
    fun templateReleaseService() = BkTemplateReleaseServiceImpl()

    @Bean
    fun pipelineEventDispatcher(rabbitTemplate: RabbitTemplate) = MQEventDispatcher(rabbitTemplate)
}