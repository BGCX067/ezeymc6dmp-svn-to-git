package jp.co.parrainer.ejb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Message-Driven Bean implementation class for: ExampleMessageDrivenBean
 */
@MessageDriven(activationConfig = { @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue") })
public class ExampleMessageDrivenBean implements MessageListener {

	/**
	 * Default constructor.
	 */
	public ExampleMessageDrivenBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see MessageListener#onMessage(Message)
	 */
	public void onMessage(Message message) {
		// TODO Auto-generated method stub

	}

}
