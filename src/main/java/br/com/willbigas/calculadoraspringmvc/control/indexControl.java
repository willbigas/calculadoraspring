package br.com.willbigas.calculadoraspringmvc.control;

import br.com.willbigas.calculadoraspringmvc.model.Calculadora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexControl {

    @GetMapping("/")
    private ModelAndView inicio() {
        return new ModelAndView("index");
    }

    @PostMapping("/calcularvalor")
    private ModelAndView calcular(@RequestParam("valor1") Integer numero1, @RequestParam("valor2") Integer numero2, @RequestParam("tipo") Integer tipoCalculo) {
        ModelAndView modelAndView = new ModelAndView("index");
        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1(numero1);
        calculadora.setNumero2(numero2);
        Integer resultado = null;
        if (tipoCalculo == 1) {
            resultado = calculadora.somar();
        }
        if (tipoCalculo == 2) {
            resultado = calculadora.subtrair();
        }
        if (tipoCalculo == 3) {
            resultado = calculadora.multiplicar();
        }

        if (tipoCalculo == 4) {
            resultado = calculadora.dividir();
        }
        modelAndView.addObject("resultado", resultado);
        return modelAndView;
    }
}
