package br.edu.ifpb.praticas.validadores;


import java.time.LocalDate;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * @author jose2
 */
@FacesValidator("Anovalidado")
public class AnoFilmeValidador implements Validator{

    private LocalDate validator = LocalDate.now();

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent,
                         Object o) throws ValidatorException {
        int ano = Integer.parseInt(o.toString());
        System.err.println("validando o ano "+ano);
            if(ano< 1900 || ano > this.validator.getYear()){
                throw new ValidatorException(new FacesMessage("Erro", "Ano " +
                    "inválido infome volores entre 1900 e o ano atual!"));
            }
         
    }
}
