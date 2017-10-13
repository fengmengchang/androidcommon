/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-9-5上午11:11:45
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
package com.open.android.activity.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.open.android.R;


/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-9-5上午11:11:45
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
public class CommonTitleBarActivity extends CommonCommonFragmentActivity implements OnClickListener {
	public TextView txt_left;// 左文字
	public TextView txt_title;// 中标题
	public TextView txt_right;// 右文字
	public ImageView id_iv_left;// 左图片
	public ImageView id_iv_right;// 右图片
	public LinearLayout layout_root;
	public RelativeLayout layout_titlebar;
	public TextView txt_time;//中间底部刷新时间
	public ImageView id_iv_right2;//右侧图片2
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_common_titlebar);
		init();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.open.android.activity.CommonFragmentActivity#findView()
	 */
	@Override
	protected void findView() {
		// TODO Auto-generated method stub
		super.findView();
		txt_left = (TextView) findViewById(R.id.txt_left);
		txt_title = (TextView) findViewById(R.id.txt_title);
		txt_right = (TextView) findViewById(R.id.txt_right);

		id_iv_left = (ImageView) findViewById(R.id.id_iv_left);
		id_iv_right = (ImageView) findViewById(R.id.id_iv_right);
		layout_root = (LinearLayout) findViewById(R.id.layout_root);
		layout_titlebar = (RelativeLayout) findViewById(R.id.layout_titlebar);
		
		txt_time = (TextView) findViewById(R.id.txt_time);
		id_iv_right2 = (ImageView) findViewById(R.id.id_iv_right2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.open.android.activity.CommonFragmentActivity#addfragment()
	 */
	@Override
	public void addfragment() {
		// TODO Auto-generated method stub
//		Fragment fragment = MArticlePullListFragmnet.newInstance(url, true);
//		getSupportFragmentManager().beginTransaction().replace(R.id.layout_content, fragment).commit();
	}

//	public void showLeftMenu(View view) {
//		// getSlidingMenu().showMenu();
//	}
//
//	public void toSearch(View view) {
//		// MSearchEditFragmentActivity.startMSearchEditFragmentActivity(this,
//		// url);
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.open.android.activity.CommonFragmentActivity#bindEvent()
	 */
	@Override
	protected void bindEvent() {
		// TODO Auto-generated method stub
		super.bindEvent();
		if(id_iv_right!=null){
			id_iv_right.setOnClickListener(this);
		}
		if(id_iv_left!=null){
			id_iv_left.setOnClickListener(this);
		}
		if(txt_left!=null){
			txt_left.setOnClickListener(this);
		}
		if(txt_right!=null){
			txt_right.setOnClickListener(this);
		}
		 
		if(id_iv_right2!=null){
			id_iv_right2.setOnClickListener(this);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.open.android.activity.CommonFragmentActivity#onClick(android.view
	 * .View)
	 */
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		super.onClick(v);
//		switch (v.getId()) {
//		case R.id.id_iv_right:
//			break;
//		case R.id.id_iv_left:
//			break;
//		case R.id.txt_left:
//			break;
//		case R.id.txt_right:
//			break;
//		default:
//			break;
//		}
	}

	public void setLeftTextVisivable(boolean visiable) {
		if (txt_left != null) {
			if (visiable) {
				txt_left.setVisibility(View.VISIBLE);
				id_iv_left.setVisibility(View.GONE);
			} else {
				txt_left.setVisibility(View.GONE);
				id_iv_left.setVisibility(View.VISIBLE);
			}
		}
	}

	public void setLeftTextValue(String textvalue) {
		if (txt_left != null) {
			txt_left.setText(textvalue);
		}
	}

	public void setRightTextVisivable(boolean visiable) {
		if (txt_right != null) {
			if (visiable) {
				txt_right.setVisibility(View.VISIBLE);
				id_iv_right.setVisibility(View.GONE);
			} else {
				txt_right.setVisibility(View.GONE);
				id_iv_right.setVisibility(View.VISIBLE);
			}
		}
	}

	public void setRightTextValue(String textvalue) {
		if (txt_right != null) {
			txt_right.setText(textvalue);
		}
	}

	/**
	 * 中间 标题
	 */
	public void setCenterTextValue(String textvalue) {
		if (txt_title != null) {
			txt_title.setText(textvalue);
		}
	}
	
	/**
	 * 中间右侧图标
	 */
	public void setCenterCompoundDrawables(int resId){
		if (txt_title != null) {
			txt_title.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(resId),null);
		}
	}
	
	/**
	 * 中间底部刷新时间
	 */
	public void setCenterTimeTextValue(String textvalue) {
		if (txt_time != null) {
			txt_time.setText(textvalue);
			txt_time.setVisibility(View.VISIBLE);
		}
	}

	public void setLeftVisivableGone() {
		txt_left.setVisibility(View.GONE);
		id_iv_left.setVisibility(View.GONE);
	}

	public void setRightVisivableGone() {
		txt_right.setVisibility(View.GONE);
		id_iv_right.setVisibility(View.GONE);
	}

	public void setLeftImageResId(int resid) {
		id_iv_left.setVisibility(View.VISIBLE);
		id_iv_left.setImageResource(resid);
	}

	/**
	 * 右侧图标 默认刷新功能
	 */
	public void setRightImageResId(int resid) {
		id_iv_right.setVisibility(View.VISIBLE);
		id_iv_right.setImageResource(resid);
	}
	
	/**
	 * 右侧图标2 默认搜索按钮
	 */
	public void setRightImage2ResId(int resid) {
		id_iv_right2.setVisibility(View.VISIBLE);
		id_iv_right2.setImageResource(resid);
	}
	
	public void setStatusBarColor(int colorId){
		if(layout_root!=null){
			layout_root.setBackgroundColor(colorId);
		}

		if(layout_titlebar!=null){
			layout_titlebar.setBackgroundColor(colorId);
		}
	}

	public static void startCommonTitleBarActivity(Context context, String url) {
		Intent intent = new Intent();
		intent.putExtra("URL", url);
		intent.setClass(context, CommonTitleBarActivity.class);
		context.startActivity(intent);
	}

}