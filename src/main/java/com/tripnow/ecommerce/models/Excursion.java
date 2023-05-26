package com.tripnow.ecommerce.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String nombre;
    private String actividad;
    private double precioExcursion;
/*    @OneToMany(mappedBy = "excursion", fetch = FetchType.EAGER)
    private Set<DestinoExcursion> destinosExcursiones = new HashSet<>();*/

    public Excursion() {
    }
    public Excursion(long id, String nombre, String actividad, double precioExcursion) {
        this.id = id;
        this.nombre = nombre;
        this.actividad = actividad;
        this.precioExcursion = precioExcursion;
    }
}
