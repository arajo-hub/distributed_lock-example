package com.woowa.test;

import com.woowa.controller.UserController;
import com.woowa.model.User;
import com.woowa.util.RequestUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 한건씩 등록 요청
 */
@Slf4j
public class SingleThreadRequest {

    public static void main(String[] args) {
        for (int i = 0; i <= User.MAXIMUM_CARD_COUNT; i++) {
            log.info("{} 번째 요청!!", i + 1);
            Integer count = RequestUtil.post(UserController.ADD_CARD_URI, 1L);
            if (count != null) {
                log.info("response count : {}\n", count);
            }
        }
    }

}