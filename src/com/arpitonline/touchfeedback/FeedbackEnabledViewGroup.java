package com.arpitonline.touchfeedback;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class FeedbackEnabledViewGroup extends RelativeLayout {

	public FeedbackEnabledViewGroup(Context context) {
		super(context);
	}

	public FeedbackEnabledViewGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public FeedbackEnabledViewGroup(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
	}
	
	private Drawable touchFeedbackDrawable;
	
	@Override
	protected void onAttachedToWindow(){
		super.onAttachedToWindow();
		touchFeedbackDrawable = getResources().getDrawable(R.drawable.touch_selector);
	}
	
	@Override
	protected void dispatchDraw(Canvas canvas){
		super.dispatchDraw(canvas);
		touchFeedbackDrawable.setBounds(0,0,getWidth(), getHeight());
		touchFeedbackDrawable.draw(canvas);
		
	}

}
