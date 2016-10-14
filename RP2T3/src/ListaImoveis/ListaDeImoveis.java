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
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

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
        objeto = excluir(codigo);
        if (objeto == true) {
            lista.add(imo);
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

        //verificar se o arquivo existe, se não existeir criar (o ato de recriar o mesmo arquivo ja resolve por se só?)
        FileWriter outFile = new FileWriter(new File(System.getProperty("user.dir") + System.getProperty("file.separator") + "Sala.csv"));
        BufferedWriter escrever = new BufferedWriter(outFile);

        escrever.write("CODIGO,LOGRADOURO,NÚMERO,BAIRRO,CIDADE,DESCRIÇÃO,AREA TOTAL,VALOR,NOME DO EDIFICIO,ANDAR,VALOR DO CONDOMINIO,"
                + "NÚMERO DE SALAS,NÚMERO DE BANHEIROS\r\n");

        // criar um metodo nas class abstratas Filewhite. 
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

    public boolean ler() throws FileNotFoundException, IOException {

        File file = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + "Sala.csv");

        if (file.exists()) {
            FileInputStream arquivo;
            BufferedReader ler;
            String linha, logradouro, bairro, cidade, descricao, nomeEdificio;
            int codigo, numero, andar, numeroSala, NumeroBanheiro;
            double areaTotal, valor, valorCondominio;
            Imovel sala;
            arquivo = new FileInputStream(new File(System.getProperty("user.dir") + System.getProperty("file.separator") + "Sala.csv"));
            ler = new BufferedReader(new InputStreamReader(arquivo, "UTF-8"));

            linha = ler.readLine();
            while ((linha = ler.readLine()) != null) {
                String parte[] = linha.split(",");
                codigo = Integer.parseInt(parte[0]);
                logradouro = parte[1];
                numero = Integer.parseInt(parte[2]);
                bairro = parte[3];
                cidade = parte[4];
                descricao = parte[5];
                areaTotal = Double.parseDouble(parte[6]);
                valor = Double.parseDouble(parte[7]);
                nomeEdificio = parte[8];
                andar = Integer.parseInt(parte[9]);
                valorCondominio = Double.parseDouble(parte[10]);
                numeroSala = Integer.parseInt(parte[11]);
                NumeroBanheiro = Integer.parseInt(parte[12]);

                sala = new SalaComercial(logradouro, numero, bairro, cidade,
                        descricao, areaTotal, valor, nomeEdificio, andar,
                        valorCondominio, NumeroBanheiro, numeroSala);
                incluir(sala);

            }
            ler.close();
            arquivo.close();
            return true;

        }
        return false;
    }
}
