package com.tripnow.ecommerce.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private FormaPago tipoTc;
    private String numeroTarjeta;
    private int numeroCVV;
    private String email;
    private double monto;
    private String descripcion;
    private LocalDateTime fechaPago;
   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orden_id")
    private Orden orden;*/

    public Pago() {
    }

    public Pago(long id, FormaPago tipoTc, String numeroTarjeta, int numeroCVV, String email, double monto, String descripcion, LocalDateTime fechaPago) {
        this.id = id;
        this.tipoTc = tipoTc;
        this.numeroTarjeta = numeroTarjeta;
        this.numeroCVV = numeroCVV;
        this.email = email;
        this.monto = monto;
        this.descripcion = descripcion;
        this.fechaPago = fechaPago;
    }
}
