package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco {

    private static List<Empresa> empresas =  new ArrayList<>();

    static{
        empresas.add(new Empresa("Alura", new Date()));
        empresas.add(new Empresa("Caelum", new Date()));
    }

    public void adiciona(Empresa empresa) {
        empresas.add(empresa);
    }
    public List<Empresa> getEmpresas(){
        return empresas;
    }
}
