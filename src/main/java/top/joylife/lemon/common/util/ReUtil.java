package top.joylife.lemon.common.util;

import top.joylife.lemon.common.bean.dto.ResultData;
import top.joylife.lemon.common.enums.SystemCode;

public class ResultUtil {

    public static ResultData success(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(SystemCode.SUCCESS.getCode());
        resultData.setData(data);
        resultData.setMsg(SystemCode.SUCCESS.getMsg());
        return resultData;
    }

    public static ResultData fail(Object data){
        ResultData resultData = new ResultData();
        resultData.setMsg(SystemCode.FAIL.getMsg());
        resultData.setCode(SystemCode.FAIL.getCode());
        resultData.setData(data);
        return resultData;
    }

    public static ResultData fail(SystemCode systemCode){
        ResultData resultData = new ResultData();
        resultData.setCode(systemCode.getCode());
        resultData.setMsg(systemCode.getMsg());
        return resultData;
    }

    
}
