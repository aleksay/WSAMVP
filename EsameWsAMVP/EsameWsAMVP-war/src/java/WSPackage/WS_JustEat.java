/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WSPackage;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import DBPackage.DBManager;
/**
 *
 * @author cloud
 */
@WebService(serviceName = "WS_JustEat")
public class WS_JustEat {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddMenuEntry")
    @Oneway
    public void AddMenuEntry(@WebParam(name = "id_rist") String id_rist, @WebParam(name = "piatto") String piatto) {
        DBManager.InsertMenuEntry(id_rist, piatto);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RemMenuEntry")
    @Oneway
    public void RemMenuEntry(@WebParam(name = "id_rist") String id_rist, @WebParam(name = "piatto") String piatto) {
        DBManager.DeleteMenuEntry(id_rist, piatto);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RemEntryMenuById")
    @Oneway
    public void RemEntryMenuById(@WebParam(name = "id") String id) {
        DBManager.DeleteMenuEntryById(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DisplayMenuRist")
    public String DisplayMenuRist(@WebParam(name = "id_rist") String id_rist) {
        //TODO write your implementation code here:
        return DBManager.getMenu(id_rist);
    }
    
}
