package com.woowa.test;

import com.woowa.controller.UserController;
import com.woowa.util.RequestUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 최종 버전 UserLevelLock 호출
 */
@Slf4j
public class FinalRequest {

    private static final int THREAD_COUNT = 20;

    public static void main(String[] args) {
        RequestUtil.concurrentPost(THREAD_COUNT, UserController.ADD_CARD_URI_FINAL, 1L);
    }å

}