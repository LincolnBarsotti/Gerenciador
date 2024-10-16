/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marco
 */
@WebServlet(name = "AlteraEmpresaServlet", urlPatterns = {"/alteraEmpresa"})
public class AlteraEmpresaServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nomeEmpresa = request.getParameter("nome");
        String paramDataEmpresa = request.getParameter("data");
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);
        
        Date dataAbertura = null;
        
        //Formata a data
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            dataAbertura = sdf.parse(paramDataEmpresa);
        } catch (ParseException ex) {
            throw new ServletException(ex);
        }
        
        Banco banco = new Banco();
        
        Empresa empresa = banco.buscaEmpresaPeloId(id);
        
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);
        
        response.sendRedirect("listaEmpresa");
        
        
    }
}
