package org.seckill.dto;

/**
 *返回类型:
 *返回暴露秒杀地址的信息,浏览器,View层面
 *
 */
public class Exposer {
    //判断是否开启秒杀 true or false
    private boolean exposed;

    //一种加密措施
    private String md5;

    private long seckillId;
    //系统时间(毫秒)
    private long now;
    //秒杀开启时间
    private long  start;
    //秒杀结束时间
    private long end;
    /**
     * 不同构造方法方便对象初始化
     * */
    //暴露地址成功
    public Exposer(boolean exposed, String md5, long seckillId) {
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }
    //不能暴露,时间不符合
    public Exposer(boolean exposed,long seckillId, long now, long start, long end) {
        this.exposed = exposed;
        this.seckillId=seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
    }
    //对象为空
    public Exposer(boolean exposed, long seckillId) {
        this.exposed = exposed;
        this.seckillId = seckillId;
    }


    public boolean isExposed() {
        return exposed;
    }

    public void setExposed(boolean exposed) {
        this.exposed = exposed;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Exposer [exposed=" + exposed + ", md5=" + md5 + ", seckillId=" + seckillId + ", now=" + now + ", start="
                + start + ", end=" + end + "]";
    }


}

