package br.unip.biometria.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Empresa {
    private String cnpj;
    private String localEmp;
    private String codAgro;
    private String porcPol;
    private String nome;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLocalEmp() {
        return localEmp;
    }

    public void setLocalEmp(String localEmp) {
        this.localEmp = localEmp;
    }

    public String getCodAgro() {
        return codAgro;
    }

    public void setCodAgro(String codAgro) {
        this.codAgro = codAgro;
    }

    public String getPorcPol() {
        return String.valueOf(porcPol);
    }

    public void setPorcPol(String porcPol) {
        this.porcPol = porcPol;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
