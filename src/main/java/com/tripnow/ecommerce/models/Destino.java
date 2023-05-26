package models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String nombre;
    @ElementCollection
    List<Integer> cantidadDias;
    private double precioHotelExcursion;
    @OneToMany(mappedBy = "destino", fetch = FetchType.EAGER)
    Set<DestinoExcursion> destinosExcursiones = new HashSet<>();
 /*   @OneToMany(mappedBy = "destino", fetch = FetchType.EAGER)
    Set<Hotel> hoteles = new HashSet<>();
    @OneToMany(mappedBy = "destino", fetch = FetchType.EAGER)
    Set<Paquete> paquetes = new HashSet<>();*/



}
