package org.crazyit.ioc;

public interface ApplicationContext
{
	// ��ȡָ��Beanʵ���ķ���
	Object getBean(String name)
		throws Exception;
}
