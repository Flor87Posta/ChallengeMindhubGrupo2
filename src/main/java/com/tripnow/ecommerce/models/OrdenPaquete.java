package com.tripnow.ecommerce.models;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class OrdenPaquete {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private long id;
    private double precioPaquete;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="orden_id")
    private Orden orden;

   /* @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="paquete_id")
    private Paquete paquete;*/


}
