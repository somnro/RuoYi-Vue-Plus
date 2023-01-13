package com.ruoyi.common.exception.user;

import com.ruoyi.common.exception.base.BaseException;

import java.io.Serial;

/**
 * 用户信息异常类
 *
 * @author ruoyi
 */
public class UserException extends BaseException {

    @Serial
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object... args) {
        super("user", code, args, null);
    }
}
