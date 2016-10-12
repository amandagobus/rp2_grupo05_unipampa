/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaImoveis;

import Imovel.Imovel;
import java.util.ArrayList;
import java.util.List;
import Imovel.ListaImoveis;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Arcano
 */
public class ListaDeImoveis implements ListaImoveis {

     List<Imovel> lista = new ArrayList<>();

    @Override
    public boolean incluir(Imovel im) {
        lista.add(im);
        return true;
    }

    @Override
    public Imovel consultar(int codigo) {

        for (Imovel imovel : lista) {
            if (codigo == imovel.getCodigo()) {
                return imovel;
            }

        }

        return null;

    }

    @Override
    public boolean editar(int codigo, Imovel im) {
      boolean  objeto; 
    objeto = excluir(codigo);
    if(objeto == true){
    lista.add(im);
    return true;
     }else {
    return false;}
    }

    @Override
    public boolean excluir(int codigo) {
    Imovel imo = consultar(codigo);    
    if(imo != null){
    lista.remove(imo);
    return true;
    } else{
    return false;
     }
    }

    @Override
    public List<Imovel> ordenarCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> ordenarValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> ordenarArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> pesquisaValor(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> pesquisaBairro(String bairro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean escreverArquivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean lerArquivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void gravar() throws Exception{
    FileOutputStream outFile;
    BufferedWriter buff;    
    outFile = new FileOutputStream(new File("c\\Bibliotecas\\Documentos\\NetBeansProjects\\rp2_grupo06_unipampa\\RP2T3"));
    buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));
    buff.write(lista.size());
    
        for (Imovel imovel : lista) {         
            buff.write(imovel.getCodigo()+"," +imovel.getLogradouro()+","+imovel.getNumero()+","+imovel.getBairro()
                    +","+imovel.getCidade()+","+imovel.getDescricao());
            
            
            buff.write("\n");
        }
        
        buff.close();
        outFile.close();
       
    }
}
