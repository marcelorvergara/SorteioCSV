/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteionomes;

/**
 *
 * @author marcelo
 */
public class FireBaseResult implements java.io.Serializable {

    private String id;
    private String nome;
    private String data;
    private String ganhador;

    public FireBaseResult() {
    }

    public FireBaseResult(String id) {
        this.id = id;
    }

    public FireBaseResult(String id, String nome, String data, String ganhador) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.ganhador = ganhador;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGanhador() {
        return this.ganhador;
    }

    public void setGanhador(String ganhador) {
        this.ganhador = ganhador;
    }

}
