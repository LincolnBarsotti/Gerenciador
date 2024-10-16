/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marco
 */
@WebServlet(name = "NovaEmpresaServlet", urlPatterns = {"/NovaEmpresa"})
public class NovaEmpresaServlet extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        
        String nomeEmpresa = request.getParameter("nome");
        String paramDataEmpresa = request.getParameter("data");
        
        Date dataAbertura = null;
        
        //Formata a data
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            dataAbertura = sdf.parse(paramDataEmpresa);
        } catch (ParseException ex) {
            throw new ServletException(ex);
        }
        
        PrintWriter out = response.getWriter();
        
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);
        
        Banco banco = new Banco();
        banco.adiciona(empresa);
        
        response.sendRedirect("listaEmpresa");
        
        //Chama o JSP
//        RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresa");
//        request.setAttribute("empresa", empresa.getNome());
//        rd.forward(request, response);
//        
    }
}
