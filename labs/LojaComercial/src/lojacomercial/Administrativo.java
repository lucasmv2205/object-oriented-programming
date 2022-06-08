/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojacomercial;

/**
 *
 * @author lucas
 */
public class Administrativo extends Funcionario {
    private float salario_base;
    private float horas_extras;

    public Administrativo(float salario_base, float horas_extras, String nome, String rg) {
        super(nome, rg);
        this.salario_base = salario_base;
        this.horas_extras = horas_extras;
    }

    public float getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(float salario_base) {
        this.salario_base = salario_base;
    }

    public float getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(float horas_extras) {
        this.horas_extras = horas_extras;
    }

    @Override
    public String toString() {
        return super.toString()+"Administrativo{" + "salario_base=" + salario_base + ", horas_extras=" + horas_extras + '}';
    }
    
    public void cadastraHoraExtra(float hora_extra){
        this.horas_extras += hora_extra;
    }
    
    public double getSalarioTotal(){
        double valorExtra = (this.salario_base/100) * this.horas_extras;
        double salario = this.salario_base + valorExtra;
        this.horas_extras = 0;
        return salario;
    }
    
}
