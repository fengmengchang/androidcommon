/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-9-14下午3:35:42
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
package com.open.android.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-9-14下午3:35:42
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
public  class ReflectJsoupUtils {
	
	public static synchronized Object invoke(String className,String methodName,Class[] parameterTypes,Object[] args){
		try {
			Class clazz = Class.forName(className);
	        Constructor c = clazz.getConstructor();
	        Method method = clazz.getMethod(methodName, parameterTypes);
	        return method.invoke(c.newInstance(), args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
