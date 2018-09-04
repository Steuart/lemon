package top.joylife.lemon.common.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import top.joylife.lemon.common.enums.SystemCode;

@Getter
@Setter
public class Warning extends RuntimeException {

    public Warning(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Warning(SystemCode systemCode){
        this.code = systemCode.getCode();
        this.msg = systemCode.getMsg();
    }

    public Warning(String msg){
        this.code = SystemCode.FAIL.getCode();
        this.msg = msg;
    }

    private int code;

    private String msg;
}
