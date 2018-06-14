package top.joylife.lemon.common.util;

import top.joylife.lemon.common.bean.dto.ResultData;
import top.joylife.lemon.common.enums.SystemCode;

public class ReUtil {

    public static <T> ResultData<T> success(T data){
        ResultData<T> resultData = new ResultData<T>();
        resultData.setCode(SystemCode.SUCCESS.getCode());
        resultData.setData(data);
        resultData.setMsg(SystemCode.SUCCESS.getMsg());
        return resultData;
    }

    public static <T> ResultData<T> fail(T data){
        ResultData<T> resultData = new ResultData<T>();
        resultData.setMsg(SystemCode.FAIL.getMsg());
        resultData.setCode(SystemCode.FAIL.getCode());
        resultData.setData(data);
        return resultData;
    }

    public static <T> ResultData<T> fail(SystemCode systemCode){
        ResultData<T> resultData = new ResultData<T>();
        resultData.setCode(systemCode.getCode());
        resultData.setMsg(systemCode.getMsg());
        return resultData;
    }

}
