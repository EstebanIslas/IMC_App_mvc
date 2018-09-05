package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.ModelIMC;
import view.ViewIMC;

public class ControllerIMC implements ActionListener {

    ModelIMC modelIMC;
    ViewIMC viewIMC;

    public ControllerIMC(ModelIMC modelIMC, ViewIMC viewIMC) {
        this.modelIMC = modelIMC;
        this.viewIMC = viewIMC;
        this.viewIMC.jb_calcular.addActionListener(this);
        initComponets();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewIMC.jb_calcular) {
            jb_calcular_action_performed();
        }
    }

    public void jb_calcular_action_performed() {
        try {
            modelIMC.setPeso(Float.parseFloat(viewIMC.jtf_peso.getText()));
            modelIMC.setEstatura(Float.parseFloat(viewIMC.jtf_estatura.getText()));
            modelIMC.calcular_imc();
            if (modelIMC.getPeso() > 22 && modelIMC.getPeso() <= 200) {
                if (modelIMC.getEstatura() >= 0 && modelIMC.getEstatura() <= 2.5) {
                    if (modelIMC.getCalcular() > 0 && modelIMC.getCalcular() < 18.3) {
                        viewIMC.jl_respuesta.setText("PESO BAJO!!");
                    } else if (modelIMC.getCalcular() >= 18.4 && modelIMC.getCalcular() < 22.59) {
                        viewIMC.jl_respuesta.setText("PESO NORMAL");
                    } else if (modelIMC.getCalcular() >= 22.6 && modelIMC.getCalcular() < 27) {
                        viewIMC.jl_respuesta.setText("SOBREPESO");
                    } else if (modelIMC.getCalcular() > 28) {
                        viewIMC.jl_respuesta.setText("OBESIDAD");
                    } else {
                        viewIMC.jl_respuesta.setText("Valor Fuera del rango");
                    }

                    viewIMC.jl_resultado.setText(String.valueOf(modelIMC.getCalcular()));
                } else {
                    viewIMC.jl_respuesta.setText("Valor Fuera del rango");

                }
            } else {
                viewIMC.jl_respuesta.setText("Valor Fuera del rango");
            }
        } catch (Exception ex) {
            viewIMC.jl_respuesta.setText("Error" + ex.getMessage());
        }
    }

    public void initComponets() {
        viewIMC.setVisible(true);
        viewIMC.setLocationRelativeTo(null);
    }

}
