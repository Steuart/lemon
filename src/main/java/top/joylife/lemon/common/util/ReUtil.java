package top.joylife.lemon.common.util;

import top.joylife.lemon.common.bean.dto.ReData;
import top.joylife.lemon.common.enums.ReCode;

public class ReUtil {

    public static ReData success(Object data){
        ReData reData = new ReData();
        reData.setCode(ReCode.SUCCESS.getCode());
        reData.setData(data);
        reData.setMsg(ReCode.SUCCESS.getMsg());
        return  reData;
    }

    public static ReData fail(Object data){
        ReData reData = new ReData();
        reData.setMsg(ReCode.FAIL.getMsg());
        reData.setCode(ReCode.FAIL.getCode());
        reData.setData(data);
        return reData;
    }

    public static ReData fail(ReCode reCode){
        ReData reData = new ReData();
        reData.setCode(reCode.getCode());
        reData.setMsg(reCode.getMsg());
        return reData;
    }

}
