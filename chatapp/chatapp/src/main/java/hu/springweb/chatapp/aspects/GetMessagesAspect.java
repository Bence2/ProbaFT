package hu.springweb.chatapp.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class GetMessagesAspect
{
	@Before("execution(* hu.springweb.chatapp.controller.MessageControllers.messageHandler(..))")
	public void doAround(JoinPoint joinPoint)
	{
		System.out.println("AspectJ around meghivodik elotte utana" + joinPoint.getSignature().getName());
	}

}
