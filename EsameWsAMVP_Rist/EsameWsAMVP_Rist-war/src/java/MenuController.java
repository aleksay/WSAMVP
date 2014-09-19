/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import wspackage.WSJustEat_Service;

/**
 *
 * @author cloud
 */
public class MenuController extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/EsameWsAMVP-war/WS_JustEat.wsdl")
    private WSJustEat_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
   // @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WS_JustEat/WS_JustEat.wsdl")
    //private WS_JustEat  service;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getAttribute("type") != null) {
            System.out.println("param type = " + request.getAttribute("type"));
            if(request.getAttribute("type").toString().equals("REM_MENU_ID")){
                remEntryMenuById((String) request.getAttribute("_id"));
            }
            if(request.getAttribute("type").toString().equals("DISPLAY_MENU_ID")){
                try (PrintWriter out = response.getWriter()) {
                   out.print(displayMenuRist((String) request.getAttribute("_id")));
                }
                catch(Exception ex) { ex.printStackTrace(); }
            }
            if(request.getAttribute("type").toString().equals("ADD_MENU")){
                                    System.out.println("add attempt vp");
                addMenuEntry(request.getAttribute("id_rist").toString(), request.getAttribute("piatto").toString());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void remEntryMenuById(java.lang.String id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wspackage.WSJustEat port = service.getWSJustEatPort();
        port.remEntryMenuById(id);
    }

    private String displayMenuRist(java.lang.String idRist) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wspackage.WSJustEat port = service.getWSJustEatPort();
        String res = port.displayMenuRist(idRist);
        System.out.println("res = " + res);
        return res;
    }

    private void addMenuEntry(java.lang.String idRist, java.lang.String piatto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wspackage.WSJustEat port = service.getWSJustEatPort();
        port.addMenuEntry(idRist, piatto);
    }

}
