/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-2-17下午3:33:07
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

/**
 ***************************************************************************************************************************************************************************** 
 * 
 * @author :fengguangjing
 * @createTime:2017-2-17下午3:33:07
 * @version:4.2.4
 * @param <T>
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 ***************************************************************************************************************************************************************************** 
 */
public class CommonPullToRefreshGridFragment2<B extends CommonBean, C extends CommonJson,A extends CommonAdapter<B>> 
extends CommonPullToRefreshGridFragment<B, C>{
	
    public A mAdapter;
	public static CommonPullToRefreshGridFragment2 newInstance(String url, boolean isVisibleToUser) {
		CommonPullToRefreshGridFragment2 fragment = new CommonPullToRefreshGridFragment2();
		fragment.setFragment(fragment);
		fragment.setUserVisibleHint(isVisibleToUser);
		fragment.url = url;
		return fragment;
	}
 
}
