package top.joylife.lemon.domain;

/**
 * Created by HemingWu on 2017/2/7.
 */
public class StatusDto {

    //id
    private int id;

    //状态码
    private byte statusCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(byte statusCode) {
        this.statusCode = statusCode;
    }
}
