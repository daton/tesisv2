package org.campos.tesisv2;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioClima extends MongoRepository<Clima, Long> {
}
