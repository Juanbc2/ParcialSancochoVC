package com.udea.parcial2.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "Todos los detalles de la clase Clima. ")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Weather implements Serializable {

    @ApiModelProperty(notes = "La base de datos genera el ID del clima")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    // Nubosidad
    @ApiModelProperty(notes = "Nubosidad")
    @Column(name = "nubosidad")
    private String nubosidad;

    // Temperatura
    @ApiModelProperty(notes = "Temperatura")
    @Column(name = "temperatura")
    private String temperatura;

    // Humedad
    @ApiModelProperty(notes = "Humedad")
    @Column(name = "humedad")
    private String humedad;

    // Presion
    @ApiModelProperty(notes = "Presion")
    @Column(name = "presion")
    private String presion;

    // Viento
    @ApiModelProperty(notes = "Viento")
    @Column(name = "viento")
    private String viento;

    // Polución
    @ApiModelProperty(notes = "Polución")
    @Column(name = "polucion")
    private String polucion;

    // precipitación
    @ApiModelProperty(notes = "Precipitación")
    @Column(name = "precipitacion")
    private String precipitacion;

    // latitud
    @ApiModelProperty(notes = "Latitud")
    @Column(name = "latitud")
    private String latitud;

    // altitud
    @ApiModelProperty(notes = "Altitud")
    @Column(name = "altitud")
    private String altitud;

}
