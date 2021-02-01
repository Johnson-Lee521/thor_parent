package com.thor.common.result;

/**
 * @ClassName Result
 * @Description: 返回状态码
 * @Author: Thor-911
 * @Date 2021/2/1
 **/
public class Result<T> {
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回具体内容
     */
    private T data;


    /**
     * 成功构造参数
     * @param code
     * @param msg
     * @param data
     */
    public Result(Integer code, String msg, T data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 异常构造参数
     * @param code
     * @param msg
     */
    public Result(Integer code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }

}
