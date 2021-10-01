package com.indra.springboot.springmongodb.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("peliculas")
public class Pelicula {

    @Id
    private String id;

    private String titulo;


}
