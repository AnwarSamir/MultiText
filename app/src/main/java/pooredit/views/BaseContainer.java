package pooredit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by bob.sun on 15/11/24.
 */
public abstract class BaseContainer extends FrameLayout {
    protected int type;
    public BaseContainer(Context context) {
        super(context);
        this.setWillNotDraw(false);
        this.requestDisallowInterceptTouchEvent(false);
        initUI();
        setType();
    }

    public BaseContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setWillNotDraw(false);
        this.requestDisallowInterceptTouchEvent(false);
        initUI();
        setType();
    }


    public int getType(){
        return type;
    }

    abstract public void initUI();
    abstract protected void setType();
    abstract public Object getJsonBean();
    abstract public boolean isEmpty();
    abstract public void focus();

}
