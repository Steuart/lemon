package top.joylife.lemon.common.enums;

import lombok.Getter;

@Getter
public enum SystemCode {

    ARTICLE_ID_WRONG(10000,"文章ID错误"),
    ARTICLE_NOT_FOUNT(10001,"查询不到文章"),
    ARTICLE_ID_CAN_NOT_BE_NULL(10002,"文章ID不能为空"),

    SUCCESS(1, "success"),
    FAIL(0, "FAIL");


    SystemCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    private int code;

    private String msg;
}
