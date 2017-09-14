/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-9-14下午2:56:34
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
package com.open.android.fragment.common;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.open.android.R;
import com.open.android.adapter.CommonAdapter;
import com.open.android.bean.CommonBean;
import com.open.android.fragment.BaseV4MVPFragment;
import com.open.android.json.CommonJson;
import com.open.android.mvp.presenter.CommonPresenter;
import com.open.android.mvp.view.CommonView;
import com.open.android.view.ExpendListView;

/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-9-14下午2:56:34
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
public class CommonExpendListMVPFragment<B extends CommonBean, C extends CommonJson, P extends CommonPresenter, A extends CommonAdapter<B>>
extends BaseV4MVPFragment<C, CommonExpendListMVPFragment> 
implements CommonView<C,P>,OnItemClickListener
{
	public P mPresenter;
	public A mAdapter;
	public List<B> list = new ArrayList<B>();
	public ExpendListView mExpendListView;

	public static CommonExpendListMVPFragment newInstance(boolean isVisibleToUser) {
		CommonExpendListMVPFragment fragment = new CommonExpendListMVPFragment();
		fragment.setFragment(fragment);
		fragment.setUserVisibleHint(isVisibleToUser);
		return fragment;
	}
	
	@Override
	public void onResume() {
		super.onResume();
		mPresenter.start();
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_common_common_expend_listview, container, false);
		mExpendListView = (ExpendListView) view.findViewById(R.id.expend_listview);
		return view;
	}
	/* (non-Javadoc)
	 * @see com.open.android.mvp.base.BaseView#setPresenter(java.lang.Object)
	 */
	@Override
	public void setPresenter(P presenter) {
		// TODO Auto-generated method stub
		mPresenter = presenter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.open.android.fragment.BaseV4Fragment#initValues()
	 */
	@Override
	public void initValues() {
		// TODO Auto-generated method stub
//		mAdapter = new A(getActivity(), list);
//		mExpendGridView.setAdapter(mAdapter);
		
	}
	
	/* (non-Javadoc)
	 * @see com.open.android.fragment.BaseV4MVPFragment#bindEvent()
	 */
	@Override
	public void bindEvent() {
		// TODO Auto-generated method stub
		super.bindEvent();
		mExpendListView.setOnItemClickListener(this);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.open.enrz.fragment.BaseV4Fragment#handlerMessage(android.os.Message)
	 */
	@Override
	public void handlerMessage(Message msg) {
		// TODO Auto-generated method stub
		switch (msg.what) {
		case MESSAGE_HANDLER:
			mPresenter.doAsync();
			break;
		default:
			break;
		}
	}
	
	/* (non-Javadoc)
	 * @see android.widget.AdapterView.OnItemClickListener#onItemClick(android.widget.AdapterView, android.view.View, int, long)
	 */
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.open.android.mvp.view.CommonView#onCallback(java.lang.Object)
	 */
	@Override
	public void onCallback(C result) {
		// TODO Auto-generated method stub
		
	}
}
