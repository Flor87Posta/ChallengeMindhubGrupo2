package com.tripnow.ecommerce.models;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private long id;
    private String nombre;
    private String apellido;
    private String pasaporte;
    private String direccion;
    private String telefono;
    private LocalDate fechaNac;
    private String email;
    private String password;
    private String historialCompras;

    @OneToMany(mappedBy="cliente", fetch= FetchType.EAGER) //asociado a cliente definido en la clase Orden, fijarse q
    // este el mappedBy para que no genere una tabla intermedia en blanco
    private Set<Orden> ordenes = new HashSet<>(); // set para evitar datos duplicados
    //ordenes como nueva propiedad de la tabla Cliente
}
