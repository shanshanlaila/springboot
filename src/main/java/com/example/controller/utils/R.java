package com.example.controller.utils;

import com.example.mapper.BookMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {

    private boolean flag;
    private Object data;
    private String msg;

    public R(boolean flag) {
        this.flag = flag;
    }

    public R(String msg) {
        this.flag=false;
        this.msg = msg;
    }

    public R(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
