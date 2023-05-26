package com.tripnow.ecommerce.models;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private long id;
    private LocalDateTime fechaCreacion;
    private boolean activa;
    private int cantidadPasajeros;
    private double precioTotalPaquetes;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="client_id")
    private Cliente cliente;

    @OneToMany(mappedBy="orden", fetch= FetchType.EAGER) //asociado a orden definido en la clase OrdenPaquete, fijarse q
    // este el mappedBy para que no genere una tabla intermedia en blanco
    private Set<OrdenPaquete> ordenesPaquetes = new HashSet<>(); // set para evitar datos duplicados
    //ordenesPaquetes como nueva propiedad de la tabla Orden

  /*  @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pago_id")
    private Pago pago;*/

    /* en clase Pago poner:
   @OneToOne(mappedBy = "pago_id")
    private Orden orden;*/
}
