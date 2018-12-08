package org.crazyit.ioc;

public interface ApplicationContext
{
	// 获取指定Bean实例的方法
	Object getBean(String name)
		throws Exception;
}
