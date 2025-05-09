package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    public void sumar(){
        int esperado=2;
        int a = 1;
        int b = 1;
        int suma;
        try {
            suma = Calculadora.sumar(a,b);
            assertEquals(esperado,suma,0);
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    @Test
    public void sumar2(){
        int esperado=2;
        int a = 3;
        int b = 1;
        int suma;
        try {
            suma = Calculadora.sumar(a,b);
            assertEquals(esperado,suma,0);
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    @Test
    public void restar(){
        int esperado=1;
        int a = 2;
        int b = 1;
        int resta;
        try {
            resta = Calculadora.restar(a,b);
            assertEquals(esperado,resta,0);
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    @Test
    public void restar2(){
        int esperado=2;
        int a = 2;
        int b = 1;
        int resta;
        try {
            resta = Calculadora.restar(a,b);
            assertEquals(esperado,resta,0);
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    @Test
    public void multiplicar(){
        int esperado=4;
        int a = 2;
        int b = 2;
        int multiplicar;
        try {
            multiplicar = Calculadora.multiplicar(a,b);
            assertEquals(esperado, multiplicar,0);
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    @Test
    public void multiplicar2(){
        int esperado=10;
        int a = 3;
        int b = 2;
        int multiplicar;
        try {
            multiplicar = Calculadora.multiplicar(a,b);
            assertEquals(esperado, multiplicar,0);
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    @Test
    public void division(){
        int esperado=2;
        int a = 4;
        int b = 2;
        int division;
        try {
            division = Calculadora.dividir(a,b);
            assertEquals(esperado, division,0);
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
    @Test
    public void division2(){
        int esperado=4;
        int a = 8;
        int b = 4;
        int division;
        try {
            division = Calculadora.dividir(a,b);
            assertEquals(esperado, division,0);
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
}
