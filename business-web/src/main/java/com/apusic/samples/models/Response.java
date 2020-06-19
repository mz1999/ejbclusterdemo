package com.apusic.samples.models;

import java.util.Objects;

public class Response implements java.io.Serializable {

    private int statusCode;

    private String userId;

    private String commodityCode;

    private int count;

    private long time;

    public Response() {
    }

    public Response(int statusCode, String userId, String commodityCode, int count, long time) {
        this.statusCode = statusCode;
        this.userId = userId;
        this.commodityCode = commodityCode;
        this.count = count;
        this.time = time;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return statusCode == response.statusCode &&
                count == response.count &&
                time == response.time &&
                Objects.equals(userId, response.userId) &&
                Objects.equals(commodityCode, response.commodityCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, userId, commodityCode, count, time);
    }

    @Override
    public String toString() {
        return "Response{" +
                "statusCode=" + statusCode +
                ", userId='" + userId + '\'' +
                ", commodityCode='" + commodityCode + '\'' +
                ", count=" + count +
                ", time=" + time +
                '}';
    }
}
