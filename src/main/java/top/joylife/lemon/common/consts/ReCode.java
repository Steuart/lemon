package top.joylife.lemon.common.consts;

public enum ReCode {
    SUCCESS(1,"success"),
    FAIL(0,"FAIL"),
    /** 
    * @Fields WRONG_PASSWORD : 用户名或密码错误 
    */ 
    WRONG_PASSWORD_OR_USERNAME(10000,"用户名或密码错误"),
    
    USER_NOT_FOUND(10001,"该用户不存在");
    
    private int code;
    private String msg;
    
    ReCode(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
}
