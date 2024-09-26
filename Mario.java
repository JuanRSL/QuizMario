package com.mycompany.quizmario;

public class Mario {

    private String nombre;
    private int vidas;
    private String salto;
    private String movimiento;

    public Mario(String nombre, int vidas, String salto, String movimiento) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.salto = salto;
        this.movimiento = movimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String getSalto() {
        return salto;
    }

    public String getMovimiento() {
        return movimiento;
    }
    
    public void moverse(String direccion) {
        if (direccion.equalsIgnoreCase("d")) {
            System.out.println(nombre + " se está moviendo a la derecha.");
        } else if (direccion.equalsIgnoreCase("a")) {
            System.out.println(nombre + " se está moviendo a la izquierda.");
        }
    }

    public void saltar(String altura) {
        if (altura.equalsIgnoreCase("w")) {
            System.out.println(nombre + " está saltando.");
        }
    }

    public void perderVida() {
        if (vidas > 0) {
            vidas--;
            System.out.println(nombre + " Vidas restantes: " + vidas);
            if (vidas == 0) {
                System.out.println("Se acabó");
            }
        }
    }    
}
