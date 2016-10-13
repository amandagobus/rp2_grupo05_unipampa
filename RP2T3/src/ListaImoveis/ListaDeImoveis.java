/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaImoveis;

import Imovel.Imovel;
import SalaComercial.SalaComercial;
import java.util.ArrayList;
import java.util.List;
import Imovel.ListaImoveis;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
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
    public boolean editar(int codigo, Imovel imo) {
        boolean objeto;
        int i = lista.indexOf(codigo);
        objeto = excluir(codigo);
        if (objeto == true) {
            lista.add(i, imo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean excluir(int codigo) {
        Imovel imo = consultar(codigo);
        if (imo != null) {
            lista.remove(imo);
            return true;
        } else {
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

    public void gravar() throws Exception {
        FileWriter outFile = new FileWriter(new File("C:/Users/Arcano/Desktop/novo.CSV"));
        BufferedWriter escrever = new BufferedWriter(outFile);

        escrever.write("CODIGO,LOGRADOURO,NÚMERO,BAIRRO,CIDADE,DESCRIÇÃO,AREA TOTAL,VALOR,NOME DO EDIFICIO,ANDAR,VALOR DO CONDOMINIO,"
                + "NÚMERO DE SALAS,NÚMERO DE BANHEIROS\r\n");
        for (Imovel imovel : lista) {
            escrever.write(imovel.getCodigo() + "," + imovel.getLogradouro() + "," + imovel.getNumero()
                    + "," + imovel.getBairro() + "," + imovel.getCidade() + "," + imovel.getDescricao() + "," + imovel.getAreaTotal()
                    + "," + imovel.getValor() + "," + imovel.getNomeEdificio() + "," + imovel.getAndar() + "," + imovel.getValorCondominio()
                    + "," + imovel.getNumeroDaSala() + "," + imovel.getNumeroDeBanheiros());
            escrever.write("\r\n");

        }
        escrever.close();
        outFile.close();

    }

    public void ler() throws Exception {
        FileInputStream inFile;
        BufferedReader buff;
        String logradouro, bairro, cidade, descricao, nomeEdificio;
        int codigo, numero, andar, numeroSala, NumeroBanheiro;
        double areaTotal, valor, valorCondominio;
        SalaComercial sala;
        inFile = new FileInputStream(new File("C:/Users/Arcano/Desktop/novo.CSV"));
        buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));

        String linha = null;
        linha = buff.readLine();
        while (linha == buff.readLine()) {
            String parte[] = linha.split(",");
            codigo = Integer.parseInt(parte[1]);
            logradouro = parte[2];
            numero = Integer.parseInt(parte[3]);
            bairro = parte[4];
            cidade = parte[5];
            descricao = parte[6];
            areaTotal = Double.parseDouble(parte[7]);
            valor = Double.parseDouble(parte[8]);
            nomeEdificio = parte[9];
            andar = Integer.parseInt(parte[10]);
            valorCondominio = Double.parseDouble(parte[11]);
            numeroSala = Integer.parseInt(parte[12]);
            NumeroBanheiro = Integer.parseInt(parte[13]);

            sala = new SalaComercial(logradouro, numero, bairro, cidade, descricao, areaTotal, valor, nomeEdificio, andar, valorCondominio, NumeroBanheiro, numeroSala);

            lista.add(sala);
            
            buff.close();
            inFile.close();
        }

    }

}
