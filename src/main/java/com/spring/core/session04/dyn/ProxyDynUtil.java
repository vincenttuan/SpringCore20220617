package com.spring.core.session04.dyn;

// 動態代理工具
public class ProxyDynUtil {
	// 代理的物件
	private Object object;
	// 將代理物件注入 
	public ProxyDynUtil(Object object) {
		this.object = object;
	}
	// 取得代理物件
	public Object getPrioxy() {
		Object proxyObj = null;
		
		return proxyObj;
	}
	
}
