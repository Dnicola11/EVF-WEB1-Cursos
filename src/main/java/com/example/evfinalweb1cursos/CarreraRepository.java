package com.example.evfinalweb1cursos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "carreras", path = "carreras")
public interface CarreraRepository extends CrudRepository<Carrera, Long> { 
}
