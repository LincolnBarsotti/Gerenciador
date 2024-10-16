/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marco
 */

@WebServlet(urlPatterns = "/oi")
public class OiMundo extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("OI MUNDO, Construi meu primeiro SERVLETS");
        out.println("</body>");
        out.println("</html>");
        
        System.out.println("Foiiiiiiiiii");
        
    }    
}
