package top.joylife.lemon.common.bean.dto;

import lombok.Data;

@Data
public class ResultData<T> {

    private int code;

    private String msg;

    private T Data;
}
