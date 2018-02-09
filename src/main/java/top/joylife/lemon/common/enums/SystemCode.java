package top.joylife.lemon.common.enums;

import lombok.Getter;

@Getter
public enum SystemCode {
    SUCCESS(1,"success"),
    FAIL(0,"FAIL");

    SystemCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
    private int code;

    private String msg;
}
