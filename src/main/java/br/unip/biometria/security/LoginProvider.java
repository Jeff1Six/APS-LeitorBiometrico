package br.unip.biometria.security;

import com.machinezoo.sourceafis.FingerprintImage;
import com.machinezoo.sourceafis.FingerprintImageOptions;
import com.machinezoo.sourceafis.FingerprintMatcher;
import com.machinezoo.sourceafis.FingerprintTemplate;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginProvider {
    
    public Boolean verificaBiometriaDiretor(String path) throws IOException{
        FingerprintTemplate prova = new FingerprintTemplate(
	new FingerprintImage(
		Files.readAllBytes(Paths.get("./src/main/java/img/bio_diretor.png")),
		new FingerprintImageOptions()
			.dpi(500)));
        
        FingerprintTemplate candidato = new FingerprintTemplate(
	new FingerprintImage(
		Files.readAllBytes(Paths.get(path)),
		new FingerprintImageOptions()
			.dpi(500)));
        
        double pontuacao = new FingerprintMatcher(prova)
	.match(candidato);
        boolean combina = pontuacao >= 40;
        return combina;
    }
    
    public Boolean verificaBiometriaMinistro(String path) throws IOException{
        FingerprintTemplate prova = new FingerprintTemplate(
	new FingerprintImage(
		Files.readAllBytes(Paths.get("./src/main/java/img/bio_ministro.jpg")),
		new FingerprintImageOptions()
			.dpi(500)));
        
        FingerprintTemplate candidato = new FingerprintTemplate(
	new FingerprintImage(
		Files.readAllBytes(Paths.get(path)),
		new FingerprintImageOptions()
			.dpi(500)));
        
        double pontuacao = new FingerprintMatcher(prova)
	.match(candidato);
        boolean combina = pontuacao >= 40;
        return combina;
    }
    
    public NivelAcessoEnum retornaTipoAcesso(String path){
        NivelAcessoEnum nivel = NivelAcessoEnum.LIVRE;
        try {
            if(verificaBiometriaDiretor(path)){
                JOptionPane.showMessageDialog(null, "Diretor entrou!");
                nivel = NivelAcessoEnum.DIRETOR;
            }else if(verificaBiometriaMinistro(path)){
                JOptionPane.showMessageDialog(null, "Ministro entrou!");
                nivel = NivelAcessoEnum.MINISTRO;
            }else{
                JOptionPane.showMessageDialog(null, "Você não possuí nenhum acesso especial!");
                nivel = NivelAcessoEnum.LIVRE;
            }
        } catch (IOException ex) {
            Logger.getLogger(LoginProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nivel;
    }
    
}
