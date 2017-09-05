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
public class CommonPullToRefreashListMVPFragment2<B extends CommonBean, C extends CommonJson, P extends CommonPresenter, A extends CommonAdapter<B>> 
extends CommonPullToRefreashListMVPFragment<B, C, P> {
	public A mAdapter;

	public static CommonPullToRefreashListMVPFragment2 newInstance(boolean isVisibleToUser) {
		CommonPullToRefreashListMVPFragment2 fragment = new CommonPullToRefreashListMVPFragment2();
		fragment.setFragment(fragment);
		fragment.setUserVisibleHint(isVisibleToUser);
		return fragment;
	}

}
