package com.sunny.tools;

import java.util.UUID;

/**
 * @author tec_feng
 * @create 2020-05-09 12:54
 */
public class UUIDUtils {
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
