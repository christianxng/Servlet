package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco {

    private static List<Empresa> empresas =  new ArrayList<>();

    static{
        Empresa empresa = new Empresa("Alura", new Date());
        Empresa empresa1 = new Empresa("Caelum", new Date());
        empresas.add(empresa);
        empresas.add(empresa1);
    }

    public void adiciona(Empresa empresa) {
        empresas.add(empresa);
    }

    public List<Empresa> getEmpresas(){
        return empresas;
    }
}
