package com.xgame.framework.lifecycle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * 关闭执行
 * @author jacky.jiang
 *
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Scope("prototype")
@Component
public @interface Shutdown {
	// 启动项
	ShutdownOrder order();
	
	// 描述
	String desc();
}
