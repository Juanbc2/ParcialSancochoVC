package com.udea.parcial2.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "Todos los detalles de la ciudad. ")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class City implements Serializable {

    @ApiModelProperty(notes = "La base de datos genera el ID de la ciudad")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ApiModelProperty(notes = "Codigo de la ciudad")
    @Column(name = "codigoCiudad")
    private String codigoCiudad;

    @ApiModelProperty(notes = "Nombre de la ciudad")
    @Column(name = "nombre")
    private String nombreCiudad;

    @ApiModelProperty(notes = "Codigo del pais")
    @Column(name = "codigoPais")
    private String codigoPais;

    @ApiModelProperty(notes = "Nombre del pais")
    @Column(name = "nombrePais")
    private String nombrePais;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idClima", referencedColumnName = "id")
    private Weather clima;

}
