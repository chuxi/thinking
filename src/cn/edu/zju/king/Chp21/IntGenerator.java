package cn.edu.zju.king.Chp21;

/**
 * Created by king on 15-4-13.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel(){ canceled=true;}
    public boolean isCanceled() { return canceled; }
}
