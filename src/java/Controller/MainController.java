/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MainModel;
import Query.MainQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author altha
 */
public class MainController extends BaseController {
    MainQuery query = new MainQuery(); 
    ArrayList arrayList = new ArrayList();
    
    public ArrayList get() throws SQLException{
        String query = this.query.get;
        ResultSet rs = this.get(query);
        
        while (rs.next()){
            MainModel model = new MainModel();
            model.setId(rs.getString("id"));
            model.setName(rs.getString("name"));
            model.setCategory(rs.getString("category"));
            model.setExpired_at(rs.getString("Expired_at"));
            model.setQty(rs.getInt("qty"));
            
            arrayList.add(model);
        }
        return arrayList;
    }
}
