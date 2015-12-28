package jp.co.parrainer.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import jp.co.parrainer.client.ExampleSessionBeanLocal;

/**
 * Session Bean implementation class ExampleSessionBean
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
public class ExampleSessionBean implements ExampleSessionBeanLocal {

    /**
     * Default constructor. 
     */
    public ExampleSessionBean() {
        // TODO Auto-generated constructor stub
    }

}
