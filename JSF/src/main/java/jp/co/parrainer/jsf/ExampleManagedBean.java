package jp.co.parrainer.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@SessionScoped
public class ExampleManagedBean {
	
	public void doExampleAjaxCall(AjaxBehaviorEvent event) throws AbortProcessingException {
		
	}
	
}
