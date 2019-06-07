/**
 * 
 */
package com.qa.retryAndListener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

/**
 * @author Biswajit Satapathy
 *
 */
public class RetryListener implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, @SuppressWarnings("rawtypes") Class testClass, @SuppressWarnings("rawtypes") Constructor testConstructor, Method testMethod) {
		
		
		IRetryAnalyzer analyzer = annotation.getRetryAnalyzer();

	    if (analyzer == null)   {
	        annotation.setRetryAnalyzer(Retry.class);
		
	    	}

		}
	
}
