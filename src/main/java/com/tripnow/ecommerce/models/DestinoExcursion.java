package models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class DestinoExcursion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String nombreExcursion;
    private String actividadExcursion;
    private double precioExcursion;

    @ManyToOne (fetch = FetchType.EAGER)
    private Destino destino;

/*
    @ManyToOne (fetch = FetchType.EAGER)
    private Excursion excursion;
*/

}
