/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.audio.dao;
import com.audio.entity.Piste;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.audio.utils.Connexion;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author LENOVO
 */
public class PisteDao implements Idao<Piste> {
    private static PisteDao instance;
    private Statement statement;
    private ResultSet resultSet;
    
    public PisteDao(){
    Connexion cs=Connexion.getInstance();
        try {
            statement = cs.getCnx().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(PisteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static PisteDao getInstance(){
        if(instance==null) 
            instance=new PisteDao();
        return instance;
    }
    @Override
    public int delete(Piste p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Piste> displayAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Piste displayByLink(String link) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(Piste o) {
        String req="insert into personne (name,link) values ('"+o.getName()+"','"+o.getLink()+"')";
        try {
            statement.executeUpdate(req);
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(PisteDao.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    @Override
    public boolean update(Piste os) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int mod(Piste o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
