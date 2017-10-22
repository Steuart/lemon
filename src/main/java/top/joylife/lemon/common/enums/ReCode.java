package top.joylife.lemon.common.enums;

import lombok.Getter;

@Getter
public enum ReCode {
    SUCCESS(1,"success"),
    FAIL(0,"FAIL");

    ReCode(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
    private int code;

    private String msg;
}
