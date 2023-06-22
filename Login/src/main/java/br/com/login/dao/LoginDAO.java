/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import static org.postgresql.core.SqlCommandType.SELECT;

/**
 *
 * @author rapha
 */
public class LoginDAO {
    
    public void cadastrarUsuarioi(String nome,String email,String senha) throws SQLException{
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO login (nome,email,senha)VALUES('"+nome+"','"+email+"','"+senha+"')";
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.execute();
        conexao.close();
    }

    public void cadastrarUsuario(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void login(String email,String senha) throws SQLException{
        
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT email,senha FROM login WHERE email = '"+email+"' AND senha = '"+senha+"'";
        PreparedStatement statment = conexao.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();
        
        if(rs.next()){
            System.out.println("possui");
        }else{
             System.out.println("nao possui");
        }
        
        statment.execute();
        conexao.close();
        
    }
}
