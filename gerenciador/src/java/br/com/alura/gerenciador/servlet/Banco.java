/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.servlet.Empresa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author marco
 */
class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    private static Integer chaveSequencial = 1;
    
    static {
        Empresa empresa = new Empresa();
        Empresa empresa2 = new Empresa();
        
        empresa.setNome("Oracle");
        empresa.setId(chaveSequencial++);
        empresa2.setNome("Google");
        empresa2.setId(chaveSequencial++);
        lista.add(empresa);
        lista.add(empresa2);
        
        
    }
    
    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        Banco.lista.add(empresa);
    }
    
    public List<Empresa> getEmpresas(){
        return Banco.lista;
    }

    public void removeEmpresa(Integer id) {
        
        Iterator<Empresa> it = lista.iterator();
        
        while(it.hasNext()){
            Empresa emp = it.next();
            
            if(emp.getId() == id){
                it.remove();
            }
        }
    }

    public Empresa buscaEmpresaPeloId(Integer id) {
        for(Empresa empresa : lista){
            if(empresa.getId() == id){
                return empresa;
            }
        }
        return null;
    }
    
}
