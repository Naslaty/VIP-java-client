package fr.insalyon.creatis.vip.client.processing.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import org.junit.Test;

import fr.insalyon.creatis.vip.client.processing.model.Execution;
import fr.insalyon.creatis.vip.client.processing.model.PipelineParameter;

public class ApiChangesTest {
	@Test
	public void inputValueTest() throws Exception{		
		Method m = Execution.class.getMethod("getInputValues");
		Class<?> returnClass = m.getReturnType();
		assertEquals(Map.class, returnClass);
	}
		
	@Test
	public void defaultValueTest() throws Exception{
		Field[] pipelineParameterFields = PipelineParameter.class.getDeclaredFields();
		for (Field field : pipelineParameterFields){
			if (field.getName().equals("defaultValue")) {
				Class<?> fieldClass = field.getType();
				if(!Object.class.equals(fieldClass)){
					throw new RuntimeException("defaultValue field exists but is not an Object");
				}
				Method getMethod = PipelineParameter.class.getMethod("getDefaultValue");
				Class<?> methodGetClass = getMethod.getReturnType();
				assertTrue(methodGetClass.equals(Object.class));
				// To check setDefaultValue(Object) exist 
				PipelineParameter.class.getMethod("setDefaultValue", Object.class);
				return;
				
			}
		}
		throw new RuntimeException("No field named \"defaultValue\" in PipelineParameter class");
}
}
