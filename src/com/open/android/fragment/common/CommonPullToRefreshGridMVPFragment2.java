/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-8-14下午3:35:57
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
package com.open.android.fragment.common;

import com.open.android.adapter.CommonAdapter;
import com.open.android.bean.CommonBean;
import com.open.android.json.CommonJson;
import com.open.android.mvp.presenter.CommonPresenter;

/**
 ***************************************************************************************************************************************************************************** 
 * 
 * @author :fengguangjing
 * @createTime:2017-8-14下午3:35:57
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 ***************************************************************************************************************************************************************************** 
 */
public class CommonPullToRefreshGridMVPFragment2<B extends CommonBean, C extends CommonJson, P extends CommonPresenter, A extends CommonAdapter<B>> 
extends CommonPullToRefreshGridMVPFragment<B, C, P> {
	public A mAdapter;

	public static CommonPullToRefreshGridMVPFragment2 newInstance(boolean isVisibleToUser) {
		CommonPullToRefreshGridMVPFragment2 fragment = new CommonPullToRefreshGridMVPFragment2();
		fragment.setFragment(fragment);
		fragment.setUserVisibleHint(isVisibleToUser);
		return fragment;
	}

}
