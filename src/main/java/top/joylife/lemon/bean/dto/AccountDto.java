package top.joylife.lemon.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
public class AccountDto {

    private Integer   id;
    private Integer   userId;
    private Integer   identifyType;
    private String    identifier;
    private String    credential;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private Boolean   status;

}
