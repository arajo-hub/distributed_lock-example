package com.woowa.test;

import com.woowa.controller.UserController;
import com.woowa.util.RequestUtil;

/**
 * JdbcTemplate 을 이용한 UserLevelLock 호출
 */
public class WithJdbcTemplateRequest {

    private static final int THREAD_COUNT = 20;

    public static void main(String[] args) {
        RequestUtil.concurrentPost(THREAD_COUNT, UserController.ADD_CARD_URI_WITH_TEMPLATE, 1L);
    }
}