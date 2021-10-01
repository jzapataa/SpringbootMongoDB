package com.indra.springboot.springmongodb.repositorios;


import com.indra.springboot.springmongodb.entites.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepositorio extends MongoRepository<Cliente, String> {
}
