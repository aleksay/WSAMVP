/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cloud
 */
public class DBManager {
    
    static Connection conn;
    static Statement st;
    static ResultSet rs;
    
    public static void accessDB() {
        String url = "jdbc:derby://localhost:1527/sample";
        String user = "app";
        String pwd = "app";
        try{
            DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
            conn = DriverManager.getConnection(url, user, pwd);
            st = conn.createStatement();
            rs = st.executeQuery("Select * From ESAME_MENU");
            while (rs.next()){
                System.out.println("NAME = " + rs.getString("NAME"));
            }
            rs.close();
            st.close();
            conn.close();
        } catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static String getMenu(String id_rist){
        String ret = "<table><tr><th>Piatti</th><th>Rimuovi</th></tr>";
        if(id_rist != null && id_rist.length() > 0){
            Statement my_st = CustomerStatement();
            try{
                ResultSet my_rs = my_st.executeQuery("select * from ESAME_MENU where id_ristorante=" + id_rist);
                while (my_rs.next()){
                    ret += "<tr><td>";
                    ret += my_rs.getString("piatto");
                    ret += "</td><td><a href='RimuoviPiatto.jsp?_id=" + my_rs.getInt("id") + "' >X</a></td>";
                    ret += "</tr>";
                }
                ret += "</table>";
            }
            catch (Exception ex) {
                ex.printStackTrace();
                System.out.println(ex.toString());
            }
        }
        System.out.println("ret from DBManager = " + ret);
        return ret;
    }
    
    private static Statement CustomerStatement(){
        String url = "jdbc:derby://localhost:1527/sample";
        String user = "app";
        String pwd = "app";
        Statement stat = null;
        try{
            conn = DriverManager.getConnection(url, user, pwd);
            stat = conn.createStatement();
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
        return stat;
    }
    
    public static void InsertMenuEntry(String id_rist, String piatto){
        st = CustomerStatement();
        try{
            int cnt = 0;
            if(id_rist != null && id_rist.length() > 0 && piatto != null && piatto.length() > 0){
                rs = st.executeQuery("select count(*) from ESAME_RISTORANTE where id=" + id_rist);
                cnt = rs.getInt(0);
                if(cnt>0){
                    st.executeUpdate("insert into ESAME_MENU(id, id_ristorante, piatto) values((select count(*)+1 from ESAME_MENU), " + id_rist + ", '" + piatto + "')");
                    st.close();
                }
                conn.close();
            }
            else{
                System.out.println("inserisce un id_rist e piatto");
            }
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public static void DeleteMenuEntry(String id_rist, String piatto){
        st = CustomerStatement();
        try{
            if(id_rist != null && id_rist.length() > 0 && piatto != null && piatto.length() > 0){
                st.executeUpdate("delete from ESAME_MENU where id_ristorante = " + id_rist + " and piatto = '" + piatto + "')");
                st.close();
                conn.close();
            }
            else{
                System.out.println("selezione un id_rist e piatto");
            }
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public static void DeleteMenuEntryById(String id_menu){
        st = CustomerStatement();
        try{
            if(id_menu != null && id_menu.length() > 0){
                st.executeUpdate("delete from ESAME_MENU where id = " + id_menu);
                st.close();
                conn.close();
            }
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public String getNameLike(String like){
        String ret = "";
        st = CustomerStatement();
        try{
            if(like != null && like.length() > 0){
                rs = st.executeQuery("Select * from customer where name like '%" + like + "%'");
                while (rs.next()){
                    ret += "NAME = " + rs.getString("NAME") + "\n<br/>";
                }
                rs.close();
                st.close();
                conn.close();
            }
            else{
             System.out.println("inserisce un parametro");
            }
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
        return ret;
    }
    
}
