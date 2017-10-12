/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2016-12-26下午3:29:19
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
package com.open.android.json;

import java.io.Serializable;
import java.util.List;

import com.open.android.bean.CommonBean;

/**
 ***************************************************************************************************************************************************************************** 
 * 
 * @author :fengguangjing
 * @createTime:2016-12-26下午3:29:19
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 ***************************************************************************************************************************************************************************** 
 */
public class CommonJson implements Serializable {
	private List<CommonBean> dotlist;

	public List<CommonBean> getDotlist() {
		return dotlist;
	}

	public void setDotlist(List<CommonBean> dotlist) {
		this.dotlist = dotlist;
	}
	
	

}
