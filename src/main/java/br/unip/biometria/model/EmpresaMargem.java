package br.unip.biometria.model;

public class EmpresaMargem extends Empresa{
    private Integer id;
    private String localFabrica;

    public String getId() {
        return Integer.toString(id);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocalFabrica() {
        return localFabrica;
    }

    public void setLocalFabrica(String localFabrica) {
        this.localFabrica = localFabrica;
    }
    
    
}
