package com.woowa.test;

import com.woowa.controller.UserController;
import com.woowa.util.RequestUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 동시에 등록 요청
 */
@Slf4j
public class MultiThreadRequest {

    private static final int THREAD_COUNT = 20;

    public static void main(String[] args) {
        RequestUtil.concurrentPost(THREAD_COUNT, UserController.ADD_CARD_URI, 1L);
    }

}
