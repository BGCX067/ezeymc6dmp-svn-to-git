package jp.co.parrainer.jsf;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.flow.Flow;
import javax.faces.flow.FlowScoped;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

@ManagedBean
@FlowScoped("flowExample")
public class ExampleFlowScoped {
	
	@Produces
	@FlowDefinition
	public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
		return null;
		
	}
	
}
