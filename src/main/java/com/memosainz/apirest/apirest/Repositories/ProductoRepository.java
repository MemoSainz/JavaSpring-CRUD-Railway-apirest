package com.memosainz.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memosainz.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}