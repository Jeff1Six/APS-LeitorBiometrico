package br.unip.biometria.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.unip.biometria.model.Agrotoxico;
import br.unip.biometria.model.Empresa;
import br.unip.biometria.model.EmpresaLeve;
import br.unip.biometria.model.EmpresaMargem;
import br.unip.biometria.model.EmpresaPesada;

public class BiometriaDAO {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/aps_bio";
    static String user = "root";
    static String password = "";

    public static final List<Empresa> listaEmpresas() {
        List<Empresa> empresas = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, user, password)) {
            Statement stmt = conn.createStatement();

            var query = "SELECT *\n"
                    + "  FROM empresas;";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Empresa empresa = new Empresa();
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setCodAgro(rs.getString("id_legal"));
                empresa.setLocalEmp(rs.getString("local_emp"));
                empresa.setPorcPol(rs.getString("porc_pol"));
                empresa.setNome(rs.getString("cnpj"));

                empresas.add(empresa);
            }
 
        } catch (SQLException ex) {
        	  Logger.getLogger(BiometriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empresas;
    }

    public static final List<EmpresaLeve> listaEmpresasLeve() {
        List<EmpresaLeve> empresas = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, user, password)) {
            Statement stmt = conn.createStatement();

            var query = "select * from empresas e\n" + 
            		"inner join empresa_leve l\n" + 
            		"on e.id_empresa = l.id_empresa;\n";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                EmpresaLeve empresa = new EmpresaLeve();
                empresa.setId(rs.getInt("id_empresa"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setCodAgro(rs.getString("local_emp"));
                empresa.setPorcPol(rs.getString("porc_pol"));

                empresas.add(empresa);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BiometriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empresas;
    }

    public static final List<EmpresaPesada> listaEmpresasPesado() {
        List<EmpresaPesada> empresas = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, user, password)) {
            Statement stmt = conn.createStatement();

            var query = "select * from empresas e\n" + 
            		"inner join empresa_pesada p\n" + 
            		"on e.id_empresa = p.id_empresa;";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                EmpresaPesada empresa = new EmpresaPesada();
                empresa.setId(rs.getInt("id_empresa"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setCodAgro(rs.getString("local_emp"));
                empresa.setPorcPol(rs.getString("porc_pol"));

                empresas.add(empresa);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BiometriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empresas;
    }

    public static final List<EmpresaMargem> listaEmpresasMargem() {
        List<EmpresaMargem> empresas = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, user, password)) {
            Statement stmt = conn.createStatement();

            var query = "select id_emp_margem, porc_pol, id_pesada\n" + 
            		"from empresa_margem\n" + 
            		"where id_empresa in(1,2,3,4)\n" + 
            		"and porc_pol between 1 and 50;";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                EmpresaMargem empresa = new EmpresaMargem();
                empresa.setId(rs.getInt("id_empresa"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setCodAgro(rs.getString("local_emp"));
                empresa.setPorcPol(rs.getString("porc_pol"));

                empresas.add(empresa);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BiometriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empresas;
    }

    public static final List<Agrotoxico> listaAgrotoxicosLegais() {
        List<Agrotoxico> agrotoxicos = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, user, password)) {
            Statement stmt = conn.createStatement();

            var query = "SELECT cod,\n"
                    + "       marca,\n"
                    + "       modelo,\n"
                    + "       taxa_pol\n"
                    + "  FROM agro_legais;";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Agrotoxico agrotoxico = new Agrotoxico();
                agrotoxico.setCodigo(rs.getInt("cod"));
                agrotoxico.setMarca(rs.getString("marca"));
                agrotoxico.setModelo(rs.getString("modelo"));
                agrotoxico.setTaxaPol(rs.getFloat("taxa_pol"));

                agrotoxicos.add(agrotoxico);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BiometriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return agrotoxicos;
    }

    public static final List<Agrotoxico> listaAgrotoxicosIlegais() {
        List<Agrotoxico> agrotoxicos = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, user, password)) {
            Statement stmt = conn.createStatement();

            var query = "SELECT marca,\n"
                    + "       cod,\n"
                    + "       taxa_pol,\n"
                    + "       modelo\n"
                    + "  FROM agro_ilegais;";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Agrotoxico agrotoxico = new Agrotoxico();
                agrotoxico.setCodigo(rs.getInt("cod"));
                agrotoxico.setMarca(rs.getString("marca"));
                agrotoxico.setModelo(rs.getString("modelo"));
                agrotoxico.setTaxaPol(rs.getFloat("taxa_pol"));

                agrotoxicos.add(agrotoxico);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BiometriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return agrotoxicos;
    }
}
